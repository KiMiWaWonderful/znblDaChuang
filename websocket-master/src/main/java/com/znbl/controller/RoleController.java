package com.znbl.controller;

import com.znbl.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class RoleController {

    @RequestMapping("/choiceRole/{roleId}")
    public String choiceRole(@PathVariable Integer roleId, HttpServletRequest request){
        // 不搞service了
        HttpSession session = request.getSession(false);
        User user = (User) session.getAttribute("user");
        user.setRoleId(roleId);

        //直接把user存到redis中
        // 取的参加的辩论模块
        String debateId = user.getDebateId();
        session.setAttribute("user",user);
        session.setAttribute("hello","world");
        request.setAttribute("test","test ok!!!");
        // 前往辩论页面
        return "index";
    }

}
