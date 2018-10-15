package com.newer.test;

import com.newer.bean.Customer;
import com.newer.bean.Person;
import com.newer.printer.Printer;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.Date;

public class BeanTest {
    @Test
    public void test1(){
        ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
        Person p=ctx.getBean("p1",Person.class);
        System.out.println(p.getName());

    }
    @Test
    public void test2(){
        ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
        Person p2=ctx.getBean("p2",Person.class);
        System.out.println(p2.getName()+" "+p2.getBirth());
      //  System.out.println(Date.valueOf("2001-02-21"));

    }
    @Test
    public void test3(){
        ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
        Customer c1=(Customer) ctx.getBean("c1");
        System.out.println(c1.getPersons().size());
        System.out.println(c1.getPersons().get(1).getName());
    }
    @Test
    public void test4(){
        ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
        Printer printer= (Printer)ctx.getBean("printer");
        printer.printer(200,122,22,"面向方面编程 AOP（Aspect Oriented Programming）是一种“关注点（Concern）”分离技术，通过运用“方面（aspect）”这种程序设计单元，允许开发者使用结构化的设计和编码，反映出其对系统的认识方式。AOP使设计和编码更加模块化、更加具结构化，从而使关注点局部化而不是分散于整个系统中。同时，需要定义好关注点和系统其他部分的接口，从而真正达到“分离关注点，分而治之”的目的。面向方面编程 AOP（Aspect Oriented Programming）是一种“关注点（Concern）”分离技术，通过运用“方面（aspect）”这种程序设计单元，允许开发者使用结构化的设计和编码，反映出其对系统的认识方式。AOP使设计和编码更加模块化、更加具结构化，从而使关注点局部化而不是分散于整个系统中。同时，需要定义好关注点和系统其他部分的接口，从而真正达到“分离关注点，分而治之”的目的。面向方面编程 AOP（Aspect Oriented Programming）是一种“关注点（Concern）”分离技术，通过运用“方面（aspect）”这种程序设计单元，允许开发者使用结构化的设计和编码，反映出其对系统的认识方式。AOP使设计和编码更加模块化、更加具结构化，从而使关注点局部化而不是分散于整个系统中。同时，需要定义好关注点和系统其他部分的接口，从而真正达到“分离关注点，分而治之”的目的。");
    }
}
