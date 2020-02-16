package com.qf.controller;

import com.qf.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping(path= "/login" ,method = RequestMethod.GET ,params = "id" ,headers = "host")
    public String login(){
        System.out.println("登录成功");
        return "success";
    }
    @PostMapping("/testPost")
    public String testPost(String username,String password){
        System.out.println(username);
        System.out.println(password);
        return "success";
    }
    @GetMapping ("/testGet")
    public String testGet(User user){
        System.out.println(user.toString());
        return "success";
    }

    @GetMapping ("/testUser")
    public String testUser(User user){
        System.out.println(user.toString());
        return "success";
    }

    @RequestMapping("/testBody")//post方式提交才能获取到
    public String testBody(@RequestBody String body){
        System.out.println(body);
        return "success";
    }

    @RequestMapping ("/testPathVariable/{id}")
    public String testPathVariable(@PathVariable(name = "id") String id){
        System.out.println(id);
        return "success";
    }

    @RequestMapping ("/testRequestHeader")
    public String testRequestHeader(@RequestHeader(value="Accept") String header){
        System.out.println(header);
        return "success";
    }

    @RequestMapping ("/testCookieValue")
    public String testCookieValue(@CookieValue(value="JSESSIONID") String jsessionid){
        System.out.println(jsessionid);
        return "success";
    }

}
