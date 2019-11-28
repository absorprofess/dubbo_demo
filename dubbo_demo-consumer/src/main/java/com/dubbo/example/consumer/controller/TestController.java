package com.dubbo.example.consumer.controller;

import com.dubbo.example.DemoService;
import example.DemoService2;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Reference(version = "1.0.0")
    private DemoService demoService;

    @Reference(version = "1.0.0")
    private DemoService2 demoService2;

    @GetMapping(value = "/test")
    public String test() {
        return demoService.sayHello("test");
    }

    @GetMapping(value = "/test2")
    public String test2() {
        return demoService2.service2();
    }

}
