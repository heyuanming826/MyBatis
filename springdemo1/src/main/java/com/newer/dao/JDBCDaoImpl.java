package com.newer.dao;

public class JDBCDaoImpl implements HelloDao{
    public void sayHello(){
        System.out.println("使用JDBC，实现sayHello");
    }
}
