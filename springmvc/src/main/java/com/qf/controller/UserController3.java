package com.qf.controller;

import com.qf.entity.User;
import com.qf.exception.MyException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController3 {

    @RequestMapping("/toLogin")
    public String toLogin(){
        return "login";
    }

    @RequestMapping("login")
    public String login(User user) throws Exception{

        if(user.getUsername()=="" || user.getUsername()==null){
            throw new MyException("用户名不能为空");
        }
        return  "success";
    }
}
