package com.springcloud.service;

import com.springcloud.entity.Dept;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.util.List;

@EntityScan(value="*.*.entity")
public interface DeptService {

    public boolean add(Dept dept);

    public Dept get(Long id);

    public List<Dept> list();
}
