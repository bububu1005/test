package com.bu.start;

import com.bu.controller.DemoController;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class start {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("classpath:applicationContext.xml");

        DemoController demoController = (DemoController) context.getBean("demoController");

        System.out.println("消费者开启");

        demoController.sayHello();

        System.in.read();

    }

}
