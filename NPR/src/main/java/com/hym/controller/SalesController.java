package com.hym.controller;

import com.hym.pojo.Sales;
import com.hym.service.SalseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class SalesController {

    @Autowired
    private SalseService salseService;

    @ResponseBody
    @RequestMapping(value = "/select1",method = RequestMethod.GET)
    public List<Sales> findAll(){
        System.out.println("111");
        return salseService.findAll();
    }
}
