package org.watermelon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 添加服务熔断的provider
 */
@SpringBootApplication
@EnableEurekaClient
@EnableCircuitBreaker
public class DistributeHystrixProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(DistributeHystrixProviderApplication.class, args);
    }

}
