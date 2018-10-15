package com.newer.aop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

import java.util.Arrays;

public class DoAroundMethod implements MethodInterceptor {
    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        System.out.println("前置通知");
        String name= methodInvocation.getMethod().getName();
        System.out.println("调用方法名："+name);
        Object[] args=methodInvocation.getArguments();
        System.out.println("方法参数:"+Arrays.toString(args));
        Object result=null;
        try{
             result=methodInvocation.proceed();
            System.out.println("后置通知");
        }catch(Exception e){
            System.out.println("异常通知");
        }finally {
            System.out.println("最终通知");
        }

        return result;
    }
}
