package org.watermelon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient     //开启服务发现，从注册中心发现服务
public class DistributeDeptConsumerApplication {

    public static void main(String[] args){
        SpringApplication.run(DistributeDeptConsumerApplication.class,args);
    }

}
