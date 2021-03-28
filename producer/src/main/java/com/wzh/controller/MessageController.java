package com.wzh.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {
    @Value("${server.port}")
    Integer port;
    @RequestMapping("getMessage")
    public String getMessage(String name){
        System.out.println("远程服务调用");
        return "hi " + name + ",i am from port:" + port;
    }
}
