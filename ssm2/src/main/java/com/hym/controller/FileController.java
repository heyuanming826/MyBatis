package com.hym.controller;

import org.apache.commons.io.FileUtils;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;

@Controller
public class FileController {

    @RequestMapping("/upload")
    public String upload(MultipartFile myPic,HttpSession session) throws IOException {
        //获取要保存文件目录的绝对路径
        String path=session.getServletContext().getRealPath("images");
        String fileName=myPic.getOriginalFilename();

        File file=new File(path,fileName);
        //将上传文件保存到指定路径
        myPic.transferTo(file);
        session.setAttribute("fileName",fileName);
        return "suc";
    }
    @RequestMapping("/domnload")
    public ResponseEntity<byte[]> download(String fileName,HttpSession session) throws IOException {
        String path=session.getServletContext().getRealPath("images");
        File file=new File(path,fileName);

        HttpHeaders headers=new HttpHeaders();
        //设置响应内容类型为流
        headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
        //设置响应处理方式为附件
        headers.setContentDispositionFormData("attachment",fileName);
        return new ResponseEntity<byte[]>(FileUtils.readFileToByteArray(file),headers, HttpStatus.OK);
    }
}
