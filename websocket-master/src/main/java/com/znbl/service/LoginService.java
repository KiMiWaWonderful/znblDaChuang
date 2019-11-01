package com.znbl.service;

import com.znbl.dao.UsersDao;
import com.znbl.pojo.User;
import com.znbl.pojo.ZnblResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Service
public class LoginService {

    @Autowired
    private UsersDao usersDao;

    public ZnblResult login(Integer id, HttpServletRequest request){

        User user = usersDao.getUserById(id);
        if(user == null){
            return ZnblResult.ok("没有该用户");
        }
        HttpSession session = request.getSession();
        session.setAttribute("user",user);
        return ZnblResult.ok(user);
    }


}
