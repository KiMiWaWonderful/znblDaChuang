package com.znbl.common.mapper;

import com.znbl.common.entity.User;

public interface UserMapper {

    //注册
    public void addUser(User user);

    //登录
    public User getUserByUserNameAndPassword(String userName,String password);

    //根据用户名查出密码
    public String getPasswordByUserName(String userName);
}
