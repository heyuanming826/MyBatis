package com.newer.dao;

import com.newer.bean.Student;

import java.util.List;

public interface StudentDao {
    //嵌套结果方式查询
    List<Student> findAll();

    List<Student> findAll2();

    List<Student> findByCid(int classid);
}
