package com.oldmonk.cloud.service.remote;

import com.oldmonk.cloud.service.hystrix.HelloFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @program: cloud-lx
 * @description: 远程服务调用
 * @author: xujingyang
 * @create: 2019-10-09 13:07
 **/
@FeignClient(name = "spring-cloud-eureka-producer2", fallback = HelloFallback.class)
public interface HelloRemote {

    @RequestMapping("/hello")
    String hello2(@RequestParam("name") String name);
}
