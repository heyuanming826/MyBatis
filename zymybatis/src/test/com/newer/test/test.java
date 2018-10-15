package com.newer.test;


import com.newer.bean.Author;
import com.newer.dao.AuthorDao;
import com.newer.util.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.sql.Date;


public class test {
    @Test
    public void finyAll(){
        SqlSession sqlSession= SqlSessionUtil.getSqlSession();
        AuthorDao dao=sqlSession.getMapper(AuthorDao.class);
        dao.finyAll().forEach(author->System.out.println(author.toString()));

        SqlSessionUtil.closeSqlSession(sqlSession);

    }
    @Test
    public void author(){
        SqlSession sqlSession= SqlSessionUtil.getSqlSession();
        AuthorDao dao=sqlSession.getMapper(AuthorDao.class);
        Author author=dao.author(8);
       System.out.println(author.toString());
        SqlSessionUtil.closeSqlSession(sqlSession);
    }

    @Test
    public void deleteAuthor(){
        SqlSession sqlSession= SqlSessionUtil.getSqlSession();
        AuthorDao dao=sqlSession.getMapper(AuthorDao.class);
       dao.deleteAuthor(11);
        sqlSession.commit();
        SqlSessionUtil.closeSqlSession(sqlSession);
    }


    @Test
    public void addAuthor(){
        SqlSession sqlSession= SqlSessionUtil.getSqlSession();
        AuthorDao dao=sqlSession.getMapper(AuthorDao.class);
        Author author=new Author();
        author.setName("王五");
        author.setSex("女");
        author.setBirthday(Date.valueOf("2012-2-20"));
        author.setAddress("liualiualiuliuliu");
        author.setPhone("11111111112");
        dao.addAuthor(author);
        sqlSession.commit();
        SqlSessionUtil.closeSqlSession(sqlSession);
    }


    @Test
    public void updateAuthor(){
        SqlSession sqlSession= SqlSessionUtil.getSqlSession();
        AuthorDao dao=sqlSession.getMapper(AuthorDao.class);
        Author author=new Author();
        author.setId(12);
        author.setName("王五");
        author.setSex("女");
        author.setBirthday(Date.valueOf("2022-2-20"));
        author.setAddress("啦啦啦啦啦啦啦啦");
        author.setPhone("12111111121");
        dao.updateAuthor(author);
        sqlSession.commit();
        SqlSessionUtil.closeSqlSession(sqlSession);
    }
}
