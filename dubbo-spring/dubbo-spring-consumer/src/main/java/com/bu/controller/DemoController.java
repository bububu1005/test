package com.bu.controller;

import com.bu.service.DemoService;

public class DemoController {

    private DemoService demoService;
    public void setDemoService(DemoService demoService) {
        this.demoService = demoService;
    }

    public void sayHello(){
        String result = demoService.sayHello("赵四");
        System.out.println(result);
    }
}
