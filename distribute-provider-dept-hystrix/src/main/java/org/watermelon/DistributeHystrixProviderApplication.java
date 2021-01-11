package org.watermelon;

import com.netflix.hystrix.contrib.metrics.eventstream.HystrixMetricsStreamServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.Bean;

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

    /**
     * 添加hystrix流监控Servlet，用于接受HystrixDashboard的监控
     * <p>实现监控需要@{@link EnableCircuitBreaker}注解的支持
     * @return bean
     */
    @Bean
    public ServletRegistrationBean<HystrixMetricsStreamServlet> hystrixMetricsStreamServlet(){
        ServletRegistrationBean bean = new ServletRegistrationBean(new HystrixMetricsStreamServlet());
        bean.setLoadOnStartup(1);
        bean.addUrlMappings("/actuator/hystrix.stream");
        bean.setName("HystrixMetricsStreamServlet");
        return bean;
    }

}
