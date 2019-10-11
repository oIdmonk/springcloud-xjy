package com.oldmonk.cloud.controller;

import com.oldmonk.cloud.service.remote.HelloRemote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: cloud
 * @description: 测试接口
 * @author: xujingyang
 * @create: 2019-10-08 14:45
 **/
@RestController
public class HelloController {

    @Autowired
    HelloRemote remote;

    @RequestMapping("/hi/{name}")
    public String index(@PathVariable("name") String name) {
        return remote.hello2(name);
    }

}
