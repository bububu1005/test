package com.bu.impl;

import com.bu.service.DemoService;

public class DemoServiceImpl implements DemoService {

    public String sayHello(String name) {
        return "Hello " + name;
    }
}
