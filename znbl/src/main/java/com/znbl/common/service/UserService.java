package com.znbl.common.service;

import com.znbl.common.entity.User;

public interface UserService {

    //注册
    public void register(User user);

    //登录
    public User login(String userName,String password);

    //根据用户名查出密码
    public String getPasswordByUserName(String userName);
}
