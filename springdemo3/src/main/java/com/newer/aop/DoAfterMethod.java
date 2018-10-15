package com.newer.aop;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

public class DoAfterMethod implements AfterReturningAdvice {
    @Override
    public void afterReturning(Object o, Method method, Object[] objects, Object o1) throws Throwable {
        System.out.println("后置通知：方法调用结束获得返回值之后代码");
    }
}
