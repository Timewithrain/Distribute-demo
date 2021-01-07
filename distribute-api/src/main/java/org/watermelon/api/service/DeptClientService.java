package org.watermelon.api.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.watermelon.api.entity.Dept;

import java.util.List;

/**
 * 构建一个feign服务，通过feign的方式实现客户端负载均衡
 */
@Component
@FeignClient(value = "distribute-provider-dept")
public interface DeptClientService {

    @RequestMapping("/add")
    boolean addDept(Dept dept);

    @RequestMapping("/queryById/{Id}")
    Dept getDept(@PathVariable("Id") int Id);

    @RequestMapping("/queryAll")
    List listDept();

}
