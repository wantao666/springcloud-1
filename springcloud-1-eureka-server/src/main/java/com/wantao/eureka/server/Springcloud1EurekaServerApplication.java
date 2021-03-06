package com.wantao.eureka.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer  //启动服务注册中心
@SpringBootApplication
public class Springcloud1EurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springcloud1EurekaServerApplication.class, args);
    }
}
