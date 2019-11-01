package com.znbl.common.serviceImpl;

import com.znbl.common.entity.User;
import com.znbl.common.mapper.UserMapper;
import com.znbl.common.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    //注册
    public void register(User user) {

        userMapper.addUser(user);
    }

    //登录
    public User login(String userName,String password) {
        return userMapper.getUserByUserNameAndPassword(userName,password);
    }

    @Override
    public String getPasswordByUserName(String userName) {
        return userMapper.getPasswordByUserName(userName);
    }
}
