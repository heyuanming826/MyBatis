package com.newer.service;

import com.newer.pojo.User;

/**
 * @author shining
 */
public interface UserService {

    User login(String username, String userpwd);


    int addUser(User user);
}
