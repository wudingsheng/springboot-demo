package com.dswu.springbootdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class Test {
    @GetMapping("test")
    public String Test(){
        return "k8s_CICD_V1.0";
    }
}
