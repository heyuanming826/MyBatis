package com.newer.test;

import com.newer.dao.ArticleMapper;
import com.newer.util.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.sql.Date;
import java.util.HashMap;
import java.util.Map;

public class test {
    @Test
    public void test(){
        SqlSession sqlSession= SqlSessionUtil.getSqlSession();
        ArticleMapper dao=sqlSession.getMapper(ArticleMapper.class);

       Map<String,Object> params=new HashMap<>();

        //params.put("title","啊%");
        params.put("order","publish_time");
       // params.put("sort","desc");
        params.put("pageNo",1);
        params.put("pageSize",2);
        dao.findAll(params).forEach(ar->{
            System.out.println(ar.getTitle()+" "+ar.getPublish_time());
        });

    }
}
