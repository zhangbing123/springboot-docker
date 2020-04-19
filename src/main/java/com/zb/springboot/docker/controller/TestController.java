package com.zb.springboot.docker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(value = "test")
@RestController
public class TestController {

    @GetMapping("hello")
    public String hello(@RequestParam("name") String name) {
        return "hello " + name+"456";
    }
}
