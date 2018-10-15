package com.newer.test;

import com.newer.bean.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.UserService;

public class test {
    @Test
    public void test(){
        ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService service=ctx.getBean("userService",UserService.class);

        service.findAll().forEach(user -> System.out.println(user.getUserName()));
    }
    @Test
    public void testAdd(){
        ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService service=ctx.getBean("userService",UserService.class);

        User user=new User();
        user.setUserName("alice");
        user.setUserPwd("11111");
        service.addUser(user);

    }

}
