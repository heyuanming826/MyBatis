package com.newer.bean;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;

public class Author implements Serializable {
    private Integer auId;
    private String auName;
    private String auSex;
    private Date auBirthday;
    private String auAddress;
    private String auphone;


    public Integer getAuId() {
        return auId;
    }

    public void setAuId(Integer auId) {
        this.auId = auId;
    }

    public String getAuName() {
        return auName;
    }

    public void setAuName(String auName) {
        this.auName = auName;
    }

    public String getAuSex() {
        return auSex;
    }

    public void setAuSex(String auSex) {
        this.auSex = auSex;
    }

    public Date getAuBirthday() {
        return auBirthday;
    }

    public void setAuBirthday(Date auBirthday) {
        this.auBirthday = auBirthday;
    }

    public String getAuAddress() {
        return auAddress;
    }

    public void setAuAddress(String auAddress) {
        this.auAddress = auAddress;
    }

    public String getAuphone() {
        return auphone;
    }

    public void setAuphone(String auphone) {
        this.auphone = auphone;
    }

}
