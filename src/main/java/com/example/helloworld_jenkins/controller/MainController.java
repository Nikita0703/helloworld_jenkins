package com.example.helloworld_jenkins.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1")
public class MainController {
    @GetMapping
    public String hello(){
        return "hello,world";
    }
}
