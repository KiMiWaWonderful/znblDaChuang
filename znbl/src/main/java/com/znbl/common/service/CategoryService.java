package com.znbl.common.service;

import com.znbl.common.entity.Category;

import java.util.List;

public interface CategoryService {

    //根据id查询category
    public Category getCategoryById(Integer id);

    //查询所有category
    public List<Category> getAllCategories();
}
