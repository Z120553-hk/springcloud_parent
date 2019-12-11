package com.hkdpp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableFeignClients(basePackages= {"com.hkdpp"})
@EnableEurekaClient
public class ConsumerUserApp {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerUserApp.class,args);
    }
}
