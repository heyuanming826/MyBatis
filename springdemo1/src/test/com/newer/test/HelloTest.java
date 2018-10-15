package com.newer.test;

import com.newer.dao.HelloDao;
import com.newer.dao.JDBCDaoImpl;
import com.newer.dao.MybatisDao;
import com.newer.service.HelloService;
import com.newer.service.HelloServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloTest {
    @Test
    public void test(){
        //JDBCDaoImpl jdbc=new JDBCDaoImpl();
      //  jdbc.sayHello();
//        MybatisDao md=new MybatisDao();
//        md.sayHello();
//        HelloDao hd=new JDBCDaoImpl();
//        hd.sayHello();

//        HelloService hs=new HelloServiceImpl();
////        hs.sayHello();
        //得到应用上下文
        ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
            HelloService hs=ctx.getBean("helloService",HelloService.class);
            hs.sayHello();
    }
}
