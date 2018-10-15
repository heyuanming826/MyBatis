package com.hym.controller;

import com.hym.pojo.Users;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

@Controller
public class UserxController {

    @ResponseBody
    @RequestMapping(value = "/xxUser")
    public Users uu(HttpSession session){
        Users user=(Users)session.getAttribute("loginer");
        return user;
    }
}
