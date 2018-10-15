package com.newer.service;

import com.newer.dao.CourseDao;

public class CourseServiceImpl implements CourseService {
    private CourseDao cDao;

    public CourseDao getcDao() {
        return cDao;
    }

    public void setcDao(CourseDao cDao) {
        this.cDao = cDao;
    }

    public void Course(){
    cDao.Course();
    }
}
