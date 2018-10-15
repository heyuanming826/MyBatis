package com.newer.test;

import com.newer.bean.Author;
import com.newer.dao.ArticleCommtMapper;
import com.newer.dao.AuthorMapper;
import com.newer.util.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;


public class test {

   @Test
    //评论表来查
    public void test1() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();

        ArticleCommtMapper dao = sqlSession.getMapper(ArticleCommtMapper.class);
            dao.findAll().forEach(ac-> {
                System.out.println(ac.getArId().getArTitle()+" "+ac.getArId().getArcontent());
                System.out.println(ac.getAuId().size());

            });
    }
        @Test
    public void test2(){
             SqlSession sqlSession = SqlSessionUtil.getSqlSession();
             AuthorMapper dao=sqlSession.getMapper(AuthorMapper.class);

             dao.findAll().forEach(au->{
                 System.out.println(au.getAuName());
                 System.out.println(au.getArId().size());
             });
         }

}
