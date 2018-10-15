package com.hym.controller;

import com.hym.util.SecurityCode;
import com.hym.util.SecurityImage;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@Controller
public class ImageCodeController {

    @RequestMapping("/imageCode")
    public void checkName( HttpServletResponse resp,HttpSession session) throws IOException {
        String code= SecurityCode.getSecurityCode();
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
        resp.getOutputStream().flush();
    }
}
