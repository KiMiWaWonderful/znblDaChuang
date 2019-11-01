package com.znbl.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebsocketController {


    @RequestMapping("/connect")
    public String toIndex(){
        System.out.println("---------*****---------");
        return "index";
    }



}
