package com.hym.controller;

import com.newer.util.SecurityCode;
import com.newer.util.SecurityImage;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/user")
public class prcture {
    @RequestMapping("/imageCode")
    public void prc(HttpSession session,HttpServletResponse resp) throws  Exception {
        //获取验证码
        String code = SecurityCode.getSecurityCode();

        //将验证码保存到session
        session.setAttribute("verityCode", code);
        //设置内容类型
        resp.setContentType("image/jpeg");
        //设置浏览器不缓存响应内容
        resp.setHeader("Pragma", "No-cache");
        resp.setHeader("Cache-Control", "no-cache");
        //设置失效时间
        resp.setDateHeader("Expires", 0);
        //将生成的验证码图片作为响应图片输出流，输出到客户端
        ImageIO.write(SecurityImage.getImage(code), "JPEG", resp.getOutputStream());

    }
}
