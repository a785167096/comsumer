package com.tedu.comsumer.controller;

import com.tedu.comsumer.service.ZktestClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class TestController {
    //http://localhost:9002/users/test
    //http://localhost:9002/users/demo

    @Value("${server.port}")
    String port;

    @Value("${spring.application.name:}")
    String name;

    @Value("${kd.appion.name}")
    String appName;


    @Autowired
    private ZktestClient zktestClient;

    @RequestMapping("/test")
    public String test() {
        return zktestClient.test();
    }


}
