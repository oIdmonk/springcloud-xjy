package com.oldmonk.cloud.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: cloud
 * @description: 测试接口
 * @author: xujingyang
 * @create: 2019-10-08 14:45
 **/
@RestController
public class Hello {


    @RequestMapping("/hello")
    public String index(String name) {
        return "hello " + name + "，this is first messge，我是8079服务哦";
    }

}
