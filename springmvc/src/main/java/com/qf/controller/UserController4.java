package com.qf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("user4")
public class UserController4 {

    @RequestMapping("/test_interceptor")
    public String test_interceptor(){
        System.out.println("test_interceptor");
        return "interceptor";
    }
}
