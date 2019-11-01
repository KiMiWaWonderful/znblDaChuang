package com.znbl.controller;

import com.znbl.dao.JedisClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {

    @Autowired
    private JedisClient jedisClient;

    @RequestMapping("/hello")
    public void hello(){
        System.out.println("jedisClient =00= " + jedisClient);
        System.out.println("Hello World!");
    }

    @RequestMapping("/page/login")
    public String toLogin(){
        return "login";
    }

}
