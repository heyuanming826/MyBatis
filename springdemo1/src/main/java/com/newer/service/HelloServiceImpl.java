package com.newer.service;

import com.newer.dao.HelloDao;
import com.newer.dao.JDBCDaoImpl;

public class HelloServiceImpl implements HelloService {

    private HelloDao dao;

    public  HelloServiceImpl(HelloDao helloDao){
        this.dao=helloDao;
    }
//    public void setDao(HelloDao dao) {
//        this.dao = dao;
//    }

    public HelloServiceImpl(){
     dao=new JDBCDaoImpl();
    }

    public void sayHello(){
        dao.sayHello();
    }
}
