package org.watermelon.api.service;

import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;
import org.watermelon.api.entity.Dept;

import java.util.ArrayList;
import java.util.List;

@Component
public class DeptClientFallbackFactory implements FallbackFactory<DeptClientService> {

    public DeptClientService create(Throwable throwable) {
        return new DeptClientService() {
            public boolean addDept(Dept dept) {
                return false;
            }

            public Dept getDept(int Id) {
                return new Dept(Id,"服务器繁忙，进行服务降级，请稍后重试！","无数据源");
            }

            public List listDept() {
                List list = new ArrayList();
                list.add(new Dept(0,"服务器繁忙，进行服务降级，请稍后重试！","无数据源"));
                return list;
            }
        };
    }

}
