package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

//用户控制器，查询所有用户
@RestController
@RequestMapping("/users")
public class UserController {

    @GetMapping
    public ModelAndView list(){
        return new ModelAndView("users/list");
    }
}
