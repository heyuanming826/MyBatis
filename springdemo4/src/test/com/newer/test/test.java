package com.newer.test;

import com.newer.service.CustomerService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    @Test
    public void test(){
        ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
        CustomerService service=ctx.getBean("customerService",CustomerService.class);

        service.delete("aaa");
    }
}
