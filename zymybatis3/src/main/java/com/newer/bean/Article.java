package com.newer.bean;

import java.io.Serializable;
import java.sql.Date;

public class Article implements Serializable{
    private Integer arid;
    private String title;
    private String content;
    private Date publish_time;
    private Integer au_id;
    private Author author;

    public Integer getArid() {
        return arid;
    }

    public void setArid(Integer arid) {
        this.arid = arid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getPublish_time() {
        return publish_time;
    }

    public void setPublish_time(Date publish_time) {
        this.publish_time = publish_time;
    }

    public Integer getAu_id() {
        return au_id;
    }

    public void setAu_id(Integer au_id) {
        this.au_id = au_id;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }
}
