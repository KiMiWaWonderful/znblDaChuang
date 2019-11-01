package com.znbl.common.mapper;

import com.znbl.common.entity.Category;

import java.util.List;

public interface CategoryMapper {

    //根据id查询category
    public Category getCategoryById(Integer id);

    //查询所有category
    public List<Category> getAllCategories();
}
