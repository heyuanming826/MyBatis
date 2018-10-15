package com.hym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TestController {

    @RequestMapping(value = "/test1",method = RequestMethod.GET)
    public String test1(){
        System.out.println("执行get请求");
        return "hello";
    }
}
