package com.hym.controller;

import com.newer.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

    @RequestMapping("/hello")
    public String hello(){
        System.out.println("hello被执行");
        return "hello";
    }

    @RequestMapping("/login")
    public String login(String username,String pwd){
        System.out.println(username+" : "+pwd);
        return "hello";
    }

    @RequestMapping("/login1")
    public String login1(User user){
        System.out.println(user.getUserName()+" : "+user.getUserPwd());
        return "hello";
    }
}
