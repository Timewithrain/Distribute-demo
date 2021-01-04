package org.watermelon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.watermelon.api.entity.Dept;
import org.watermelon.service.DeptService;

import java.util.List;

//@RequestMapping("/dept")
@RestController
public class DeptController {

    @Autowired
    private DeptService deptService;

    @PostMapping("/add")
    public boolean addDept(Dept dept){
        return deptService.addDept(dept);
    }

    @GetMapping("/queryById/{Id}")
    public Dept queryById(@PathVariable("Id") int Id){
        return deptService.queryDeptById(Id);
    }

    @GetMapping("/queryAll")
    public List queryAll(){
        return deptService.listAll();
    }

    public Object discovery(){
        System.out.println();
        return null;
    }

}
