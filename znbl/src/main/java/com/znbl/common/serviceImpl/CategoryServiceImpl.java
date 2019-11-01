package com.znbl.common.serviceImpl;

import com.znbl.common.entity.Category;
import com.znbl.common.mapper.CategoryMapper;
import com.znbl.common.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    CategoryMapper categoryMapper;

    //根据id查询category
    public Category getCategoryById(Integer id) {
        return categoryMapper.getCategoryById(id);
    }

    //查询所有category
    public List<Category> getAllCategories() {
        return categoryMapper.getAllCategories();
    }
}
