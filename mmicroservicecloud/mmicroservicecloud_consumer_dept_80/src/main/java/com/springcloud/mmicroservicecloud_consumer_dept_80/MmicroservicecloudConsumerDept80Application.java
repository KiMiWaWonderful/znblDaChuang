package com.springcloud.mmicroservicecloud_consumer_dept_80;

import com.myrule.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.ComponentScan;
//import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@ComponentScan(value="com.springcloud.*")
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@RibbonClient(name = "SERVICE-HI",configuration = MySelfRule.class)
public class MmicroservicecloudConsumerDept80Application {

	public static void main(String[] args) {
		SpringApplication.run(MmicroservicecloudConsumerDept80Application.class, args);
	}
}
