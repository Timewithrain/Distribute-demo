package org.watermelon.distribute.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.watermelon.api.entity.Dept;
import org.watermelon.api.service.DeptClientService;

import java.util.List;

@RestController
public class DeptConsumerController {

    /**
     * 此出DeptClientService引用自distribute-api模块中service包下的DeptClientService
     */
    @Autowired
    private DeptClientService deptClientService = null;

    @RequestMapping("/addDept")
    public boolean addDept(Dept dept){
        return this.deptClientService.addDept(dept);
    }

    @RequestMapping("/getDeptById/{Id}")
    public Dept getDept(@PathVariable("Id") int Id){
        return this.deptClientService.getDept(Id);
    }

    @RequestMapping("/listDept")
    public List<Dept> listDept(){
        return this.deptClientService.listDept();
    }



}
