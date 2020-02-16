package com.qf.controller;

import com.qf.entity.Car;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("ajax")
@ResponseBody
public class AjaxController {

    @RequestMapping("/checkAjax")
    public String checkAjax(Car car){
        System.out.println(car.toString());
        Car rcar=new Car();
        rcar.setCname("奥迪");
        rcar.setCcolor("红色");
         return "大城市";
    }
    @GetMapping("/checkGet")
    public Car checkGet(Car car){
        System.out.println(car.toString());
        Car rcar=new Car();
        rcar.setCname("奥迪");
        rcar.setCcolor("红色");
        return rcar;
    }

    @PostMapping("/checkPost")
    public Car checkPost(Car car){
        System.out.println(car.toString());
        Car rcar=new Car();
        rcar.setCname("奥迪");
        rcar.setCcolor("红色");
        return rcar;
    }


}
