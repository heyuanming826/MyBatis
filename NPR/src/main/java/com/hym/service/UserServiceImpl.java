package com.hym.service;

import com.hym.dao.UsersMapper;
import com.hym.pojo.Users;
import com.hym.util.MD5;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author shining
 */
@Service("userService")
@Transactional(propagation = Propagation.NOT_SUPPORTED,readOnly = true)
public class UserServiceImpl implements UserService{
    @Autowired
    //@Resource(name="userMapper")
    private UsersMapper userMapper;

    @Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.DEFAULT,rollbackFor = Exception.class)
    @Override
    public int addUser(Users user) {
        return userMapper.addUser(user);
    }

    @Override
    public Users login(String username, String userpwd ,String department) {
        String pwd= MD5.getInstance().getMD5ofStr(userpwd);
        return userMapper.findByParam(username,pwd,department);
    }
    @Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.DEFAULT,rollbackFor = Exception.class)
    @Override
    public int updateUser(String password,String username) {
        return userMapper.updateUser(password,username);
    }
}
