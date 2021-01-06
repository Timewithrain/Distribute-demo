package org.watermelon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class DistributeDeptProviderApplication_03 {

    public static void main(String[] args) {
        SpringApplication.run(DistributeDeptProviderApplication_03.class, args);
    }

}
