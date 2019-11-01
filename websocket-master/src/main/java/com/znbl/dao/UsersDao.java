package com.znbl.dao;

import com.znbl.pojo.User;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UsersDao {
    //Integer id, String name, Integer roleId , String debateId
    User u1 ;
    User u2 ;
    User u3 ;
    User u4 ;
    User u5 ;
    User u6 ;
    User u7 ;
    User u8 ;
    User u9 ;
    List<User> list;


    public List<User> getAllUser(){
        return list;
    }

    public User getUserById(Integer id){
        for(User u : list){
            System.out.println(u.getId());
            if(id.equals(u.getId())){
                return u;
            }
        }
        return null;
    }




}
