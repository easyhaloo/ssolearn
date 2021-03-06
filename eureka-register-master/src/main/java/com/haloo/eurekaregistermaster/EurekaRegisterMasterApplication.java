package com.haloo.eurekaregistermaster;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


/**
 * @EnableEurekaServer 启动注册中心
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaRegisterMasterApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaRegisterMasterApplication.class, args);
    }
}
