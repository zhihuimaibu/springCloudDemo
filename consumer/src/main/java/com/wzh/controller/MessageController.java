package com.wzh.controller;

import com.wzh.remoteapi.ConsumerServiceFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("feign")
public class MessageController {
    @Autowired
    private ConsumerServiceFeign consumerServiceFeign;
    @RequestMapping(value = "/getMessage")
    public String getMessage(@RequestParam String name){
        return consumerServiceFeign.getMessage(name);
    }
}