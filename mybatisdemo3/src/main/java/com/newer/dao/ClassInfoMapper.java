package com.newer.dao;

import com.newer.bean.ClassInfo;
import com.newer.bean.Student;

import java.util.List;

public interface ClassInfoMapper {
    ClassInfo findById(int classid);

    List<ClassInfo> findAll();

    List<ClassInfo> findAll2();
}
