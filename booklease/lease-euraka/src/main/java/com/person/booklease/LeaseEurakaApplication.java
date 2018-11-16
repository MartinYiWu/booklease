package com.person.booklease;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 功能描述: 服务注册中心
 *
 * @author Martin
 * @version V1.0
 * @date 2018/11/16
 */
@SpringBootApplication
@EnableEurekaServer
public class LeaseEurakaApplication {

    public static void main(String[] args) {
        SpringApplication.run(LeaseEurakaApplication.class, args);
    }
}
