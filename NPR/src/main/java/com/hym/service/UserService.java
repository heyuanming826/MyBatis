package com.hym.service;

import com.hym.pojo.Users;


/**
 * @author shining
 */
public interface UserService {

    Users login(String username, String userpwd,String department);

   int addUser(Users user);

    int updateUser(String password,String username);
}
