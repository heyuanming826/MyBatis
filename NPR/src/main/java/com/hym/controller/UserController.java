package com.hym.controller;

import com.hym.pojo.Users;
import com.hym.service.UserService;
import com.hym.util.MD5;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.PrintWriter;
import java.util.Map;


/**
 * @author shining
 */
@Controller
//@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @ResponseBody
    @RequestMapping(value = "/addUser",method = RequestMethod.POST)
    public int addUser(@RequestParam("username") String username,
                    @RequestParam("password")String userpwd,
                    @RequestParam("department")String department,
                    @RequestParam("job")String job){
        String pwd= MD5.getInstance().getMD5ofStr(userpwd);
        Users user=new Users();
        user.setUsername(username);
        user.setPassword(pwd);
        user.setDepartment(department);
        user.setJob(job);
        return userService.addUser(user);
    }

    @ResponseBody
    @RequestMapping(value = "/select",method = RequestMethod.GET)
    public Users login(@RequestParam("username")String username,
                       @RequestParam("password")String pwd,
                       @RequestParam("department")String department,
                       @RequestParam("vericode")String vericode,HttpSession session,
                       Map map,HttpServletResponse response) throws Exception{
        String code=(String) session.getAttribute("verityCode");

        if(vericode.equals(code)) {
            Users user = userService.login(username,pwd,department);

            if (user == null) {

              // response.setContentType("text/html;chatset=utf-8");
               //这是编码格式 ，有些时候界面会中文乱码、最好加上
             PrintWriter out= response.getWriter();
             out.print("mm");

               return null;

            } else {
                System.out.println("2");
                session.setAttribute("loginer", user);
                return user;

            }
        }else{
            PrintWriter out= response.getWriter();
            out.print("y");
           // map.put("msg1", "验证码输入错误！");
            return null;
        }
    }

    //修改
    @ResponseBody
    @RequestMapping(value = "/upUser1",method = RequestMethod.POST)//是不是這裡問題
    public int updateUser(@RequestParam("password")String password,
                          @RequestParam("password1")String password1,
                          @RequestParam("password2")String password2,Map map,HttpSession session){

        System.out.println("1");
        Users user=(Users)session.getAttribute("loginer");
        String pwd= MD5.getInstance().getMD5ofStr(password);
        String pwd1= MD5.getInstance().getMD5ofStr(password1);
        String pwd2= MD5.getInstance().getMD5ofStr(password2);

        if(pwd.equals(user.getPassword())){

            System.out.println("2");
           if(userService.updateUser(pwd1,user.getUsername())>0){
                System.out.println("a");
                return userService.updateUser(pwd1,user.getUsername());
            }else{
                return 0;
            }

        }else{
            System.out.println("li");
           return 0;
        }

    }
//    @RequestMapping("/login1")
//    public String login1(@RequestParam("username")String username,
//                         @RequestParam("password")String pwd,
//                         @RequestParam("vericode")String vericode,
//                         HttpSession session, Map map){
//
//        String code=(String) session.getAttribute("verityCode");
//        if(vericode.equals(code)) {
//            Users user = userService.login(username, pwd);
//
//            if (user == null) {
//                System.out.println("1");
//              map.put("msg", "用户名或密码错误！");
//               return "login";
//
//            } else {
//                System.out.println("2");
//                session.setAttribute("loginer", user);
//               return "index";
//
//            }
//        }else{
//            map.put("msg1", "验证码输入错误！");
//            return "login";
//        }
//
//    }


//    @RequestMapping("/reg")
//    public ModelAndView reg(@RequestParam("username")String username,
//                    @RequestParam("password")String userpwd,
//                    @RequestParam("department")String department,
//                    @RequestParam("job")String job,
//                            HttpSession session){
//        String pwd= MD5.getInstance().getMD5ofStr(userpwd);
//        Users user=new Users();
//        user.setUsername(username);
//        user.setPassword(pwd);
//        user.setDepartment(department);
//        user.setJob(job);
//        ModelAndView modelAndView=new ModelAndView();
//        if(userService.addUser(user)>0){
//            session.setAttribute("loginer",user);
//            modelAndView.setViewName("redirect:/login.jsp");
//        }else {
//            modelAndView.addObject("msg","注册失败！");
//            modelAndView.setViewName("register");
//        }
//        return modelAndView;
//    }
}
