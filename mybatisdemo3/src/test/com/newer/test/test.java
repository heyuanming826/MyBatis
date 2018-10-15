package com.newer.test;

import com.newer.bean.Student;
import com.newer.dao.ClassInfoMapper;
import com.newer.dao.StudentDao;
import com.newer.util.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class test {
    @Test
    public void testFind(){
        SqlSession sqlSession= SqlSessionUtil.getSqlSession();
        StudentDao dao=sqlSession.getMapper(StudentDao.class);

        dao.findAll().forEach(s->
                System.out.println(s.getStuName()+":"+s.getSclassId().getcName()));
    }


    @Test
    public void testFind2(){
        SqlSession sqlSession= SqlSessionUtil.getSqlSession();
        StudentDao dao=sqlSession.getMapper(StudentDao.class);

        dao.findAll2().forEach(s->
                System.out.println(s.getStuName()+":"+s.getSclassId().getcName()+" "+s.getSclassId().getcGrade()));
    }

    @Test
    public void testFindClass(){
        SqlSession sqlSession= SqlSessionUtil.getSqlSession();
       ClassInfoMapper dao=sqlSession.getMapper(ClassInfoMapper.class);

        dao.findAll().forEach(classInfo -> {
            System.out.println(classInfo.getcName());
            System.out.println("人数:"+classInfo.getStudents().size());
            if(classInfo.getStudents().size()>0){
                classInfo.getStudents().forEach(s-> System.out.println(s.getStuName()));
            }
        });
        SqlSessionUtil.closeSqlSession(sqlSession);
    }

    @Test
    public void testFindClass2(){
        SqlSession sqlSession= SqlSessionUtil.getSqlSession();
        ClassInfoMapper dao=sqlSession.getMapper(ClassInfoMapper.class);

        dao.findAll2().forEach(classInfo -> {
            System.out.println(classInfo.getcName());
            System.out.println("人数:"+classInfo.getStudents().size());
            if(classInfo.getStudents().size()>0){
                classInfo.getStudents().forEach(s-> System.out.println(s.getStuName()));
            }
        });
        SqlSessionUtil.closeSqlSession(sqlSession);
    }
}
