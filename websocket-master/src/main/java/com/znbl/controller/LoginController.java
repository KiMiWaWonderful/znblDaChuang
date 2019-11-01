package com.znbl.controller;

import com.znbl.pojo.ZnblResult;
import com.znbl.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
public class LoginController {

    @Autowired
    private LoginService loginService;

    @RequestMapping("/login")
    public String login(Integer id, Model model, HttpServletRequest request){
        System.out.println("登入 --- " + id);
        ZnblResult result = loginService.login(id,request);
        model.addAttribute("result",result);
        return "debateIndex";
    }


}
