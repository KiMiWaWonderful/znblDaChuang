package com.springcloud.mmicroservicecloud_eureka_8763;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
@EnableEurekaServer
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class MmicroservicecloudEureka8763Application {

	public static void main(String[] args) {
		SpringApplication.run(MmicroservicecloudEureka8763Application.class, args);
	}
}
