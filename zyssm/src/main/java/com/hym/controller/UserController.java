package com.hym.controller;

import com.newer.pojo.User;
import com.newer.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.io.PrintWriter;
import java.util.Map;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/login")
    public String login(@RequestParam("userName")String username,
                        @RequestParam("userPwd")String pwd,
                        @RequestParam("vericode") String vericode,
                        Map map, HttpSession session) {
        String verityCode = (String) session.getAttribute("verityCode");

        if (verityCode.equals(vericode)) {
            User user = userService.login(username, pwd);
            if (user == null) {
                map.put("msg", "用户名或密码错误");
                return "index";
            } else {
                session.setAttribute("loginer", user);
                return "index1";
            }
        } else {
            map.put("msg1", "验证码不一致");
            return "index";
        }
    }

    @RequestMapping("/login1")
    public ModelAndView login1(@RequestParam("userName")String username,
                               @RequestParam("userPwd")String pwd,
                               HttpSession session){
        ModelAndView modelAndView=new ModelAndView();
        User user=userService.login(username,pwd);
        if(user==null){
            modelAndView.addObject("msg","用户名或密码错误！");
            modelAndView.setViewName("index");

        }else{
            session.setAttribute("loginer",user);
            modelAndView.setViewName("redirect:/hello.jsp");
        }
        return modelAndView;
    }

    @RequestMapping("/checkName")
    public void checkName(@RequestParam("username")String username,
                          PrintWriter out){
        if(userService.checkName(username)){
            out.print("用户名可用！");
        }else {
            out.print("用户名已被注册！");
        }
    }

    @RequestMapping("/zhuce")
    public String add(@RequestParam("userName")String username,
                      @RequestParam("userPwd")String pwd,
                      Map map){
        int count=  userService.addUser(username,pwd);
        if(count>0){
            return "redirect:/index.jsp";
        }else{
            map.put("cuow","失败");
            return "register";
        }

    }
}
