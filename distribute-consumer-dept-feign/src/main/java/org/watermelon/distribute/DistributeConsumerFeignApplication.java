package org.watermelon.distribute;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = {"org.watermelon.api"})
public class DistributeConsumerFeignApplication {

    public static void main(String[] args){
        SpringApplication.run(DistributeConsumerFeignApplication.class,args);
    }


}
