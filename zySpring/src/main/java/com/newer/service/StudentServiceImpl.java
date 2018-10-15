package com.newer.service;

import com.newer.dao.CourseDao;
import com.newer.dao.StudentDao;

public class StudentServiceImpl implements StudnetService {
    private CourseDao cDao;
    private StudentDao sDao;

    public CourseDao getcDao() {
        return cDao;
    }

    public void setcDao(CourseDao cDao) {
        this.cDao = cDao;
    }

    public StudentDao getsDao() {
        return sDao;
    }

    public void setsDao(StudentDao sDao) {
        this.sDao = sDao;
    }

    public void Student(){
    sDao.Student();
    }
}
