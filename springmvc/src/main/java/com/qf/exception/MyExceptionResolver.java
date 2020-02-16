package com.qf.exception;


import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyExceptionResolver implements HandlerExceptionResolver {

    ModelAndView modelAndView = new ModelAndView();
    @Override
    public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) {
      if(e instanceof MyException){
          modelAndView.addObject("msg",e.getMessage());
      }else{
          modelAndView.addObject("msg","其他异常");
      }
        modelAndView.setViewName("login");
        return modelAndView;
    }
}
