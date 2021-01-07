package org.watermelon.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import lombok.experimental.Accessors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.watermelon.api.entity.Dept;
import org.watermelon.service.DeptService;

import java.util.List;

@RestController
public class DeptController {

    @Autowired
    private DeptService deptService;

    @PostMapping("/add")
    public boolean addDept(Dept dept){
        return deptService.addDept(dept);
    }

    /**
     * 通过Hystrix，当服务器出错时，触发熔断，调用fallback方法返回相关信息
     * @param Id
     * @return
     */
    @HystrixCommand(fallbackMethod = "queryHystrix")
    @GetMapping("/queryById/{Id}")
    public Dept queryById(@PathVariable("Id") int Id){
        Dept dept = deptService.queryDeptById(Id);
        if (dept==null){
            throw new RuntimeException("error!");
        }
        return dept;
    }

    @GetMapping("/queryAll")
    public List queryAll(){
        return deptService.listAll();
    }

    public Dept queryHystrix(@PathVariable("Id") int Id){
        return new Dept(Id,"Id不存在，服务器出现异常，触发熔断机制！","无数据源");
    }

}
