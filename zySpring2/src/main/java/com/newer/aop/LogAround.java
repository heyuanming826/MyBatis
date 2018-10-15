package com.newer.aop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.aop.MethodBeforeAdvice;

import java.util.Arrays;

public class LogAround implements MethodInterceptor{
    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        String aspect=methodInvocation.getMethod().getName();
        System.out.println("调用方法名:"+aspect);
        Object[] args=methodInvocation.getArguments();
        System.out.println("方法参数："+ Arrays.toString(args));
        boolean result=true;
        for (int i=0;i<args.length;i++){

            if  (args[i].equals("IBM")){

                    result = (boolean) methodInvocation.proceed();
                }else {
                result = false;
            }

            if(result){
                System.out.println("删除了");
            }else{
                System.out.println("删除失败");
            }
        }

        System.out.println(result);
           return result;


    }
}
