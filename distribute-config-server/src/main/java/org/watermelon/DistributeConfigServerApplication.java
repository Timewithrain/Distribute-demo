package org.watermelon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@EnableConfigServer
public class DistributeConfigServerApplication {

    public static void main(String[] args){
        SpringApplication.run(DistributeConfigServerApplication.class,args);
    }

}
