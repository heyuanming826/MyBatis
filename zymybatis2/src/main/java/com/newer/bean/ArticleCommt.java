package com.newer.bean;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;

public class ArticleCommt implements Serializable{
    private Integer acId;
    private List<Author> auId;
    private Article arId;
    private Integer au_id;
    private Integer ar_id;
    private String arcommt;
    private Date arcommTime;

    public Integer getAr_id() {
        return ar_id;
    }

    public void setAr_id(Integer ar_id) {
        this.ar_id = ar_id;
    }

    public Integer getAu_id() {
        return au_id;
    }

    public void setAu_id(Integer au_id) {
        this.au_id = au_id;
    }

    public Integer getAcId() {
        return acId;
    }

    public void setAcId(Integer acId) {
        this.acId = acId;
    }

    public List<Author> getAuId() {
        return auId;
    }

    public void setAuId(List<Author> auId) {
        this.auId = auId;
    }

    public Article getArId() {
        return arId;
    }

    public void setArId(Article arId) {
        this.arId = arId;
    }

    public String getArcommt() {
        return arcommt;
    }

    public void setArcommt(String arcommt) {
        this.arcommt = arcommt;
    }

    public Date getArcommTime() {
        return arcommTime;
    }

    public void setArcommTime(Date arcommTime) {
        this.arcommTime = arcommTime;
    }
}
