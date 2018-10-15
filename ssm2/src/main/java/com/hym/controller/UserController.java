package com.hym.controller;

import com.newer.pojo.User;
import com.newer.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import com.newer.util.MD5;

import javax.servlet.http.HttpSession;
import java.io.PrintWriter;
import java.util.Map;

/**
 * @author shining
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/login")
    public String login(@RequestParam("userName")String username,
                        @RequestParam("userPwd")String pwd,
                        Map map, HttpSession session){
        User user=userService.login(username,pwd);
        if(user==null){
            map.put("msg","用户名或密码错误！");
            return "index";
        }else{
            session.setAttribute("loginer",user);
            return "redirect:/hello.jsp";
        }
    }

    @RequestMapping("/login1")
    public ModelAndView login1(@RequestParam("userName")String username,
                               @RequestParam("userPwd")String pwd,
                               @RequestParam("vericode")String vericode,
                               HttpSession session){
        String code=(String) session.getAttribute("verityCode");
        ModelAndView modelAndView=new ModelAndView();
        if(vericode.equals(code)) {
            User user = userService.login(username, pwd);
            if (user == null) {
                modelAndView.addObject("msg", "用户名或密码错误！");
                modelAndView.setViewName("index");

            } else {
                session.setAttribute("loginer", user);
                modelAndView.setViewName("redirect:/quiz.jsp");
            }
        }else{
            modelAndView.addObject("msg", "验证码输入错误！");
            modelAndView.setViewName("index");
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

    @RequestMapping("/reg")
    public ModelAndView reg(@RequestParam("userName")String username,
                    @RequestParam("userPwd")String userpwd,
                    @RequestParam("userSex")String usersex,
                    @RequestParam("userEmail")String useremail,
                            HttpSession session){
        String pwd= MD5.getInstance().getMD5ofStr(userpwd);
        User user=new User();
        user.setUserName(username);
        user.setUserPwd(pwd);
        user.setUserSex(usersex);
        user.setUserEmail(useremail);
        ModelAndView modelAndView=new ModelAndView();
        if(userService.addUser(user)){
            session.setAttribute("loginer",user);
            modelAndView.setViewName("redirect:/hello.jsp");
        }else {
            modelAndView.addObject("msg","注册失败！");
            modelAndView.setViewName("register");
        }
        return modelAndView;
    }
}
