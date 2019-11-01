package com.springcloud.mmicroservicecloud_provider_dept_8766;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@EntityScan(value="*.*.entity")
@MapperScan(value="*.*.dao")
@ComponentScan(value="com.springcloud.*")

@EnableEurekaClient//本服务启动后会自动注册进eureka服务中
@EnableDiscoveryClient
@SpringBootApplication
public class MmicroservicecloudProviderDept8766Application {

	public static void main(String[] args) {
		SpringApplication.run(MmicroservicecloudProviderDept8766Application.class, args);
	}
}
