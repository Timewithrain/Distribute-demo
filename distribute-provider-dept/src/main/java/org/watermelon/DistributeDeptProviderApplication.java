package org.watermelon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

//服务启动后自动注册到Eureka中
@EnableEurekaClient
@SpringBootApplication
public class DistributeDeptProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(DistributeDeptProviderApplication.class, args);
    }

}
