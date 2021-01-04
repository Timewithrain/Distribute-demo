package org.watermelon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.watermelon.api.entity.Dept;

import java.util.List;

@RestController
public class DeptConsumerController {

    @Autowired
    private RestTemplate restTemplate;

    private static final String REST_PROVIDER_URL = "http://localhost:8001";

    @RequestMapping("/addDept")
    public boolean addDept(Dept dept){
        return restTemplate.postForObject(REST_PROVIDER_URL+"/add",dept,Boolean.class);
    }

    @RequestMapping("/getDeptById/{Id}")
    public Dept getDept(@PathVariable("Id") int Id){
        return restTemplate.getForObject(REST_PROVIDER_URL+"/queryById/"+Id,Dept.class);
    }

    @RequestMapping("/listDept")
    public List<Dept> listDept(){
        return restTemplate.getForObject(REST_PROVIDER_URL+"/queryAll",List.class);
    }



}
