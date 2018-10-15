package com.hym.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class Outstorage {
    private Integer outstorageid;

    private String vin;

    private Integer carid;

    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GNT-8")
    private Date outtime;

    private Integer outquantity;

    private String worker;

    private String remark;

    private Integer variable;

    private Integer customerordid;

    public Integer getOutstorageid() {
        return outstorageid;
    }

    public void setOutstorageid(Integer outstorageid) {
        this.outstorageid = outstorageid;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin == null ? null : vin.trim();
    }

    public Integer getCarid() {
        return carid;
    }

    public void setCarid(Integer carid) {
        this.carid = carid;
    }

    public Date getOuttime() {
        return outtime;
    }

    public void setOuttime(Date outtime) {
        this.outtime = outtime;
    }

    public Integer getOutquantity() {
        return outquantity;
    }

    public void setOutquantity(Integer outquantity) {
        this.outquantity = outquantity;
    }

    public String getWorker() {
        return worker;
    }

    public void setWorker(String worker) {
        this.worker = worker == null ? null : worker.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Integer getVariable() {
        return variable;
    }

    public void setVariable(Integer variable) {
        this.variable = variable;
    }

    public Integer getCustomerordid() {
        return customerordid;
    }

    public void setCustomerordid(Integer customerordid) {
        this.customerordid = customerordid;
    }
}