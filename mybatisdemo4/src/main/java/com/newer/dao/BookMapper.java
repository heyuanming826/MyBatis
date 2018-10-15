package com.newer.dao;

import com.newer.pojo.Book;

public interface BookMapper {
    int insert(Book record);

    int insertSelective(Book record);
}