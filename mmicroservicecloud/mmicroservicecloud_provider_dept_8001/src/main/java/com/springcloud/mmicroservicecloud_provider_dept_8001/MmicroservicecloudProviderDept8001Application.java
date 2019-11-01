package com.springcloud.mmicroservicecloud_provider_dept_8001;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

//@ComponentScan(value="*.*.controller","*.*.service","*.*.serviceImpl")
@EntityScan(value="*.*.entity")
//@ComponentScan(value="*.*.service")
//@ComponentScan(value="*.*.serviceImpl")
@MapperScan(value="*.*.dao")
@ComponentScan(value="com.springcloud.*")

@EnableEurekaClient//本服务启动后会自动注册进eureka服务中
@EnableDiscoveryClient
@SpringBootApplication
public class MmicroservicecloudProviderDept8001Application {

	public static void main(String[] args) {
		SpringApplication.run(MmicroservicecloudProviderDept8001Application.class, args);
	}
}
