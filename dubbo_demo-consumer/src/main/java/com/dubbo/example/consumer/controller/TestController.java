package com.dubbo.example.consumer.controller;

import com.dubbo.example.DemoService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Reference(version = "1.0.0")
    private DemoService demoService;

    @GetMapping(value = "/test")
    public String test() {
        return demoService.sayHello("test");
    }

}
