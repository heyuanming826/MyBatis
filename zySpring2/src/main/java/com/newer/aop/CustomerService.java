package com.newer.aop;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class CustomerService {
    private String aspect;

    public String getAspect() {
        return aspect;
    }

    public void setAspect(String aspect) {
        this.aspect = aspect;
    }

    public boolean delete(String cid){

        System.out.println("删除"+cid);
        return true;
    }


}
