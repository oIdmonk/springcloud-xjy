package com.oldmonk.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @program: springcloud-xjy
 * @description: 启动类
 * @author: xujingyang
 * @create: 2019-10-10 15:36
 **/
@SpringBootApplication
@EnableEurekaServer
public class ConfigEurekaCenterApllication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigEurekaCenterApllication.class, args);
    }
}
