package com.newer.service;

import com.newer.pojo.User;

/**
 * @author shining
 */
public interface UserService {

    User login(String username, String userpwd);

    boolean checkName(String username);

    boolean addUser(User user);
}
