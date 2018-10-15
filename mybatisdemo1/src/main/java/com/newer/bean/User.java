package com.newer.bean;

import java.io.Serializable;

public class User implements Serializable{
   private Integer userId;
   private String userName;
   private String userPwd;
   private String userSex;
   private String userEmail;

    public Integer getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserPwd() {
        return userPwd;
    }

    public String getUserSex() {
        return userSex;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }
}
