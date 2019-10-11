package com.oldmonk.cloud.service.hystrix;

import com.oldmonk.cloud.service.remote.HelloRemote;
import org.springframework.stereotype.Component;

/**
 * @program: cloud-lx
 * @description: 熔断器、降级处理
 * @author: xujingyang
 * @create: 2019-10-09 13:23
 **/
@Component
public class HelloFallback implements HelloRemote{
    @Override
    public String hello(String name) {
        return "服务没了，还调个锤子";
    }
}
