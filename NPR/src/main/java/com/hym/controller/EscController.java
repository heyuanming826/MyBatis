package com.hym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
public class EscController {
    @RequestMapping("/esc")
    public void esc(HttpSession session,HttpServletRequest req,HttpServletResponse resp)throws Exception{
        session=req.getSession();
        session.removeAttribute("loginer");
        resp.sendRedirect("login.jsp");
    }
}
