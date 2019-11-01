package com.service;

import com.service.service.UserServiceImpl;
import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.jaxrs.JAXRSServerFactoryBean;

import javax.jws.WebService;

@WebService
public class Server {

    public static void main(String[] args) {
        //创建发布服务的工厂
        JAXRSServerFactoryBean factory = new JAXRSServerFactoryBean();

        //设置服务地址
        factory.setAddress("http://localhost:8001/ws/");

        //设置服务类
        factory.setServiceBean(new UserServiceImpl());

        //添加日志输入输出拦截器
        factory.getInInterceptors().add(new LoggingInInterceptor());
        factory.getOutInterceptors().add(new LoggingOutInterceptor());

        //发布服务
        factory.create();

        System.out.println("susccess!!");
    }
}
