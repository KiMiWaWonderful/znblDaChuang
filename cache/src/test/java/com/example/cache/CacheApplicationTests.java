package com.example.cache;

import com.example.bean.Employee;
import com.example.mapper.EmployeeMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@MapperScan("com.example.mapper")
@RunWith(SpringRunner.class)
@SpringBootTest
public class CacheApplicationTests {

	@Autowired
	EmployeeMapper employeeMapper;
	@Test
	public void contextLoads() {
		Employee employee = employeeMapper.getEmpById(1);
		System.out.println(employee);
	}

}
