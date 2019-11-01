package com.znbl.common.controller;

import com.znbl.common.entity.Msg;
import com.znbl.common.entity.User;
import com.znbl.common.serviceImpl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserServiceImpl userServiceImpl;

    //注册
    @ResponseBody
    @RequestMapping("/register")
    public Msg register(@ModelAttribute User user){
        String userName = user.getUserName();
        String password = user.getPassword();
//        if(userName.equals("") || userName.trim().isEmpty())){
////
////        }
        if(userName.equals("")){
            //可能出现乱码
            String message = "用户名不能为空！";
            return Msg.fail().add("message",message);
        }else if(password.equals("")){
            String message = "密码不能为空！";
            return Msg.fail().add("message",message);
        }else{
            userServiceImpl.register(user);
            return Msg.success();
        }

//         userServiceImpl.register(user);
//        return Msg.success();
    }

    //登录
    //是否还要检验用户是否存在，密码为空等情况
    @ResponseBody
    @RequestMapping("/login")
    public Msg login(@RequestParam Integer id, HttpSession session, HttpServletRequest request){
        String userName = request.getParameter("userName");
        String password = request.getParameter("password");
        String passwordd = userServiceImpl.getPasswordByUserName(userName);

        if( !password.equals(passwordd)){
            String message = "密码错误!";
            return Msg.fail().add("message",message);

        }else{
            User user = userServiceImpl.login(userName,password);
            session.setAttribute("user",user);
            return Msg.success();
        }

//        User user = userServiceImpl.login(id);
//        session.setAttribute("user",user);
       // return Msg.success().add("user",user);
    }
}
