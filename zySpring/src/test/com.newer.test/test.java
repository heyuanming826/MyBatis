package com.newer.test;

import com.newer.service.StudnetService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
@Test
    public void test(){
    ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
    StudnetService ss=ctx.getBean(StudnetService.class);
    ss.Student();
}
}
