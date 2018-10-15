package service;

import com.newer.bean.User;
import com.newer.dao.UserMapper;

import java.util.List;

public class UserServiceImpl implements UserService {
    private UserMapper userMapper;

    @Override
    public List<User> findAll() {
        return userMapper.findAll();
    }

    @Override
    public int addUser(User user) {
        return userMapper.addUser(user);
    }

    public UserMapper getUserMapper() {
        return userMapper;
    }

    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }
}
