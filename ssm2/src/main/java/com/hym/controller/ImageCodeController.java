package com.hym.controller;

import com.newer.util.SecurityCode;
import com.newer.util.SecurityImage;
import org.apache.http.HttpResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

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
