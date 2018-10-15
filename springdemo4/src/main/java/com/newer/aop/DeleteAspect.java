package com.newer.aop;

import org.aopalliance.intercept.Joinpoint;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class DeleteAspect{
    /*
    前置通知
     */

    public void before(JoinPoint joinPoint){
        System.out.println("前置通知执行");
        //输出方法名
        System.out.println(joinPoint.getSignature().getName());

    }
    /*
    后置通知
     */
    public void after(JoinPoint joinPoint,Object returnValue ){

        String cid=(String)joinPoint.getArgs()[0];
        if ((boolean)returnValue){
            System.out.println("日志："+cid+"删除成功");
        }else{
            System.out.println("日志："+cid+"删除失败");
        }
    }
    /*

     */
    public void aferThrowing(Exception e)throws Throwable{
        System.out.println("异常通知");
    }

    public void finalMethod(){
        System.out.println("最终通知");
    }
    /*
    环绕通知
     */

    public Object around(ProceedingJoinPoint pjp) throws Throwable {
        String cid=(String)pjp.getArgs()[0];
        if ("IMB".equals(cid)){
            return false;
        }else {
            return pjp.proceed();
        }

    }
}
