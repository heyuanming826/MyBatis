package com.newer.bean;

import java.io.Serializable;
import java.sql.Date;

public class Student implements Serializable {
    private Integer stuId;
    private String stuName;
    private String stuSex;
    private Date stuJoinTime;
    private String stuCard;
    private ClassInfo sclassId;


    public ClassInfo getSclassId() {
        return sclassId;
    }

    public void setSclassId(ClassInfo sclassId) {
        this.sclassId = sclassId;
    }

    public Integer getStuId() {
        return stuId;
    }

    public void setStuId(Integer stuId) {
        this.stuId = stuId;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public String getStuSex() {
        return stuSex;
    }

    public void setStuSex(String stuSex) {
        this.stuSex = stuSex;
    }

    public Date getStuJoinTime() {
        return stuJoinTime;
    }

    public void setStuJoinTime(Date stuJoinTime) {
        this.stuJoinTime = stuJoinTime;
    }

    public String getStuCard() {
        return stuCard;
    }

    public void setStuCard(String stuCard) {
        this.stuCard = stuCard;
    }
}
