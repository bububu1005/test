package com.bu.start;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class start {

    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("classpath:applicationContext.xml");

        System.out.println("DemoService的服务提供者启动成功!!!");

        System.in.read();
    }
}
