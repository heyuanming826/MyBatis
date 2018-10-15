package com.hym.controller;

import com.hym.pojo.Customerorders;
import com.hym.pojo.Outstorage;
import com.hym.service.OutstorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.sql.Date;

@Controller
public class OutstorageController {

    @Autowired
    private OutstorageService outstorageService;
    @ResponseBody
    @RequestMapping(value = "/addOutstorage1",method = RequestMethod.POST)
    public int addOutstorage(@RequestParam("customerordid") int customerordid,
                             @RequestParam("carid")int carid,
                             @RequestParam("outtime")Date outtime,
                             @RequestParam("outquantity")int outquantity,
                             @RequestParam("vin")String vin,
                             @RequestParam("worker")String worker,
                             @RequestParam("remark")String remark){
        System.out.println(customerordid );
        Outstorage ot=new Outstorage();
        ot.setCustomerordid(customerordid);
        System.out.println(customerordid );
        ot.setCarid(carid);
        ot.setOuttime(outtime);
        ot.setOutquantity(outquantity);
        ot.setVin(vin);
        ot.setWorker(worker);
        ot.setRemark(remark);
        return outstorageService.addOutstorage(ot);
    }

}
