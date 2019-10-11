package com.oldmonk.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @program: cloud
 * @description: 启动类
 * @author: xujingyang
 * @create: 2019-10-09 12:06
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class ErkaProducerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ErkaProducerApplication.class);
    }
}
