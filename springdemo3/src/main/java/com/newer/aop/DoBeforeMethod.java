package com.newer.aop;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class DoBeforeMethod implements MethodBeforeAdvice {
    @Override
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println("前置通知：方法前执行的代码");

    }
}
