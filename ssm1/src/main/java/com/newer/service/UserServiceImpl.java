package com.newer.service;

import com.newer.dao.UserMapper;
import com.newer.pojo.User;
import com.newer.util.MD5;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * @author shining
 */
@Service("userService")
@Transactional(propagation = Propagation.NOT_SUPPORTED,readOnly = true)
public class UserServiceImpl implements UserService{
    @Autowired
    //@Resource(name="userMapper")
    private UserMapper userMapper;

    @Override
    public User login(String username, String userpwd) {
        String pwd= MD5.getInstance().getMD5ofStr(userpwd);
        return userMapper.findByParam(username,pwd);
    }

    @Override
    public boolean checkName(String username) {
        if(userMapper.findName(username)==null){
            return true;
        }
        return false;
    }

    @Override
    public boolean addUser(User user) {
        if(userMapper.addUser(user)>0){
            return true;
        }
        return false;
    }
}
