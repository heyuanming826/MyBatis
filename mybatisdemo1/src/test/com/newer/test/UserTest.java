package com.newer.test;

import com.newer.bean.User;
import com.newer.dao.UserDao;
import com.newer.util.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class UserTest {
    @Test
    public void testAdd(){
        //获取一个SqlSession
        SqlSession sqlSession= SqlSessionUtil.getSqlSession();
        //2.获得接口的实列
        UserDao dao=sqlSession.getMapper(UserDao.class);

        User user=new User();
        user.setUserName("HAHA");
        user.setUserPwd("111111");
       // user.setUserSex("男");
       // user.setUserEmail("bbb@qq.com");

        dao.addUser(user);
        sqlSession.commit();
        SqlSessionUtil.closeSqlSession(sqlSession);

    }
    @Test
    public void testUpdate(){
        //获取一个SqlSession
        SqlSession sqlSession= SqlSessionUtil.getSqlSession();
        //2.获得接口的实列
        UserDao dao=sqlSession.getMapper(UserDao.class);

        User user=dao.findById(1);
       user.setUserPwd("222222");

        dao.updateUser(user);
        sqlSession.commit();
        SqlSessionUtil.closeSqlSession(sqlSession);

    }
    @Test
    public  void testFindAll(){
        //获取一个SqlSession
        SqlSession sqlSession= SqlSessionUtil.getSqlSession();
        //2.获得接口的实列
        UserDao dao=sqlSession.getMapper(UserDao.class);

        dao.findAll().forEach(user -> System.out.println(user.getUserName()));


        SqlSessionUtil.closeSqlSession(sqlSession);
    }
}
