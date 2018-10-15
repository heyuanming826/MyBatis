package com.hym.controller;

import com.newer.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author shining
 */
@Controller
public class HelloController {

    @RequestMapping("/hello")
    public String hello(){
        System.out.println("hello被执行");
        return "hello";
    }

    @RequestMapping("/login")
    public String login(String username,String pwd){
        System.out.println(username+":"+pwd);
        return "hello";
    }

    @RequestMapping("/login1")
    public String login1(User user){
        //对象参数会成为模型数据，放入请求对象作用域
        System.out.println(user.getUserName()+":"+user.getUserPwd());
        //return "hello";
        //重定向
        return "redirect:/hello.jsp";
    }

}
