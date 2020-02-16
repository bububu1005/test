package com.qf.controller;

import com.qf.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

@Controller
//@RequestMapping("user2")
public class UserController2 {

    @RequestMapping("/test_String")
    public String test_String (HttpServletRequest request){
        List<User> userList=new ArrayList<User>();
        userList.add(new User(100,"郑州","133"));
        userList.add(new User(100,"参数","762"));
        userList.add(new User(100,"部分 ","76"));
        userList.add(new User(100,"为人父","577"));
        request.setAttribute("userList",userList);
        return "list";
    }
    @RequestMapping("/test_void")
    public void test_void (HttpServletRequest request, HttpServletResponse response) throws Exception{
        List<User> userList=new ArrayList<User>();
        userList.add(new User(100,"郑州","133"));
        userList.add(new User(100,"参数","762"));
        userList.add(new User(100,"部分 ","76"));
        userList.add(new User(100,"为人父","577"));
        request.setAttribute("userList",userList);
        request.getRequestDispatcher("/WEB-INF/jsp/list.jsp").forward(request,response);
    }

    @RequestMapping("/test_ModelAndView")
    public ModelAndView test_ModelAndView () {
        List<User> userList=new ArrayList<User>();
        userList.add(new User(100,"郑州","133"));
        userList.add(new User(100,"参数","762"));
        userList.add(new User(100,"部分 ","76"));
        userList.add(new User(100,"为人父","577"));
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.addObject("userList",userList);
        modelAndView.setViewName("list");
        return modelAndView;
    }

    @RequestMapping("/test_forwardAndRedirect")
    public String test_forwardAndRedirect (HttpServletRequest request, HttpServletResponse response) throws Exception{
        List<User> userList=new ArrayList<User>();
        userList.add(new User(100,"郑州","133"));
        userList.add(new User(100,"参数","762"));
        userList.add(new User(100,"部分 ","76"));
        userList.add(new User(100,"为人父","577"));
        request.setAttribute("userList",userList);
//        return "forward:login.jsp";
        return "redirect:list.jsp";
    }



}
