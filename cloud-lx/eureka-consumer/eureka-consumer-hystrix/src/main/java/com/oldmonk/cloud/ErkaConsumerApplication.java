package com.oldmonk.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @program: cloud
 * @description: 启动类
 * @author: xujingyang
 * @create: 2019-10-09 12:06
 **/
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class ErkaConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ErkaConsumerApplication.class);
    }
}
