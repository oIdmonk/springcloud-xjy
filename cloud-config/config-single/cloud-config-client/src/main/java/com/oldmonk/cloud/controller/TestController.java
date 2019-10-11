package com.oldmonk.cloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: cloud-lx
 * @description: 测试配置
 * @author: xujingyang
 * @create: 2019-10-09 19:12
 **/
@RestController
@RefreshScope // 使用该注解的类，会在接到SpringCloud配置中心配置刷新的时候，自动将新的配置更新到该类对应的字段中。
public class TestController {

    @Value("${foo}")
    private String str;

    @RequestMapping("/getStr")
    public String str() {
        return str;
    }
}
