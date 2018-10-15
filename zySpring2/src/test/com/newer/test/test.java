package com.newer.test;

import com.newer.aop.CustomerService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    @Test
    public void test(){
        ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
        CustomerService cs=ctx.getBean("proxyService",CustomerService.class);
        cs.delete("uuu");

    }
}
