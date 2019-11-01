package com.springcloud.mmicroservicecloud_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class MmicroservicecloudApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(MmicroservicecloudApiApplication.class, args);
	}
}
