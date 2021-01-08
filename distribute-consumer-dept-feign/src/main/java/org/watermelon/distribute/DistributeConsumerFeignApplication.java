package org.watermelon.distribute;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 注意此处@{@link SpringBootApplication}需要设置扫描路径，由于提供fallback方法的DeptClientService存在于
 * distribute-api模块中，虽然通过pom.xml文件引入了，但SpringBoot自动扫描包的范围仅在本模块内，无法扫描
 * 到其他模块的包，因此需要指定扫描路径。同时，由于手动设置了扫描路径，SpringBoot不会再自动扫描本模块
 * 内的包，此时无法访问到controller，需要添加本模块的controller路径
 *
 * <p>该问题是SpringBoot单模块体系中不存在的，构建SpringCloud项目时需要格外注意
 */
@SpringBootApplication(scanBasePackages = {"org.watermelon.api.service","org.watermelon.distribute"})
@EnableEurekaClient
@EnableFeignClients(basePackages = {"org.watermelon.api"})
public class DistributeConsumerFeignApplication {

    public static void main(String[] args){
        SpringApplication.run(DistributeConsumerFeignApplication.class,args);
    }


}
