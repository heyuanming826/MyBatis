package com.hym.pojo;

import java.util.Date;

public class Client {
    private Integer clientid;

    private String clientname;

    private String clientsex;

    private String marriage;

    private Date birthday;

    private String cardid;

    private String workplace;

    private String tel;

    private String email;

    private Date loadingdate;

    private Date updatedate;

    private String sales;

    private String ispurchase;

    private String variable;

    public Integer getClientid() {
        return clientid;
    }

    public void setClientid(Integer clientid) {
        this.clientid = clientid;
    }

    public String getClientname() {
        return clientname;
    }

    public void setClientname(String clientname) {
        this.clientname = clientname == null ? null : clientname.trim();
    }

    public String getClientsex() {
        return clientsex;
    }

    public void setClientsex(String clientsex) {
        this.clientsex = clientsex == null ? null : clientsex.trim();
    }

    public String getMarriage() {
        return marriage;
    }

    public void setMarriage(String marriage) {
        this.marriage = marriage == null ? null : marriage.trim();
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getCardid() {
        return cardid;
    }

    public void setCardid(String cardid) {
        this.cardid = cardid == null ? null : cardid.trim();
    }

    public String getWorkplace() {
        return workplace;
    }

    public void setWorkplace(String workplace) {
        this.workplace = workplace == null ? null : workplace.trim();
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public Date getLoadingdate() {
        return loadingdate;
    }

    public void setLoadingdate(Date loadingdate) {
        this.loadingdate = loadingdate;
    }

    public Date getUpdatedate() {
        return updatedate;
    }

    public void setUpdatedate(Date updatedate) {
        this.updatedate = updatedate;
    }

    public String getSales() {
        return sales;
    }

    public void setSales(String sales) {
        this.sales = sales == null ? null : sales.trim();
    }

    public String getIspurchase() {
        return ispurchase;
    }

    public void setIspurchase(String ispurchase) {
        this.ispurchase = ispurchase == null ? null : ispurchase.trim();
    }

    public String getVariable() {
        return variable;
    }

    public void setVariable(String variable) {
        this.variable = variable == null ? null : variable.trim();
    }
}