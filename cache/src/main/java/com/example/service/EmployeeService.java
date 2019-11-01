package com.example.service;

import com.example.bean.Employee;
import com.example.mapper.EmployeeMapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.Caching;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

@MapperScan("*.*.mapper")
@ComponentScan(value="*.*.config")
@Service
public class EmployeeService {

    @Autowired
    EmployeeMapper employeeMapper;

    @Cacheable(value = {"emp"},keyGenerator = "myKeyGenerator",condition = "#a0>1",unless = "#a0==2")
    public Employee getEmp(Integer id) {
        System.out.println("查询"+id+"号员工");
        Employee employee = employeeMapper.getEmpById(id);
        return employee;
    }

    @CachePut(value = "emp")
    public  Employee updateEmp(Employee employee){
        System.out.println("修改员工");
        employeeMapper.updateEmp(employee);
        return  employee;
    }

    @CacheEvict(value = "emp",beforeInvocation = true/*key = "#id"*/)
    public void deleteEmp(Integer id){
        System.out.println("删除员工");
    }


    @Caching(
            cacheable = {
                    @Cacheable(value = "emp",key = "#lastName")
    },
            put = {
                    @CachePut(value = "emp",key = "#result.id"),
                    @CachePut(value = "emp",key = "#result.email")
            }
    )
    public Employee getEmpByLastName(String lastName){
        return employeeMapper.getEmpByLastName(lastName);
    }
}
