package com.newer.bean;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;

public class Article implements Serializable {
    private Integer arId;
    private String arTitle;
    private String arcontent;
    private Integer au_id;
    private Date arPublishTime;
    private Author auId;

    public Integer getAu_id() {
        return au_id;
    }

    public void setAu_id(Integer au_id) {
        this.au_id = au_id;
    }

    public Author getAuId() {
        return auId;
    }

    public void setAuId(Author auId) {
        this.auId = auId;
    }

    public Integer getArId() {
        return arId;
    }

    public void setArId(Integer arId) {
        this.arId = arId;
    }

    public String getArTitle() {
        return arTitle;
    }

    public void setArTitle(String arTitle) {
        this.arTitle = arTitle;
    }

    public String getArcontent() {
        return arcontent;
    }

    public void setArcontent(String arcontent) {
        this.arcontent = arcontent;
    }

    public Date getArPublishTime() {
        return arPublishTime;
    }

    public void setArPublishTime(Date arPublishTime) {
        this.arPublishTime = arPublishTime;
    }


}
