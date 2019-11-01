package com.serviceImpl;

import com.service.HelloService;

public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello(String name) {
        return name+",Welcome!";
    }
}
