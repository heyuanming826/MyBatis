package com.newer.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;

/**
 * 按主配置文件与数据库建立连接
 * 返回SqlSession工具类
 */
public class SqlSessionUtil {
    //定义得到SqlSession的工厂对象
    private static SqlSessionFactory sqlSessionFactory;

    static{
        try {
            //读取主配置文件
            Reader reader = Resources.getResourceAsReader("mybatis-config.xml");
            //加载主配置文件，生成SqlSessionFactory
            sqlSessionFactory=new SqlSessionFactoryBuilder().build(reader);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /*
    得到SqlSession对象方法
    SqlSession：mybatis版的Connection
     */

    public static SqlSession getSqlSession(){
        return sqlSessionFactory.openSession();
    }
    /*
    关闭SqlSession
     */
    public static void closeSqlSession(SqlSession sqlSession){
        if(sqlSession!=null){
            sqlSession.close();
        }
    }
}
