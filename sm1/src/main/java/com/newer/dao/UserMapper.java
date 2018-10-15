package com.newer.dao;

import com.newer.bean.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {
    int addUser(User user);

    int updateUser(User user);

    int deleteUser(@Param("userId") int userId);

    User findById(int userId);

    List<User> findAll();
}
