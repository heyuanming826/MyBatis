package com.hym.controller;

import com.newer.pojo.Clazz;
import com.newer.service.ClazzService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class ClazzController {
    @Autowired
    private ClazzService clazzService;

    @ResponseBody
    @RequestMapping(value = "/clazzs",method = RequestMethod.GET)
    public List<Clazz> findAll(){
        return clazzService.findAll();
    }
}
