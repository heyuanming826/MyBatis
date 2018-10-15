package service;

import com.newer.bean.User;

import java.util.List;

public interface UserService {
    List<User> findAll();
    int addUser(User user);
}
