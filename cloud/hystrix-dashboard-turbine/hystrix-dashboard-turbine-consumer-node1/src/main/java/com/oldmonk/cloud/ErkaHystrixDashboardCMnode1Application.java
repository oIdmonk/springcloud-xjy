package com.oldmonk.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
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
@EnableHystrixDashboard
@EnableCircuitBreaker
public class ErkaHystrixDashboardCMnode1Application {
    public static void main(String[] args) {
        SpringApplication.run(ErkaHystrixDashboardCMnode1Application.class);
    }
}
