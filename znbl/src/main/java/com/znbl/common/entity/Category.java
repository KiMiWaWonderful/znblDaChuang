package com.znbl.common.entity;

public class Category {

    //与topic类的c_id对应
    Integer id;
    String category_name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCategory_name() {
        return category_name;
    }

    public void setCategory_name(String category_name) {
        this.category_name = category_name;
    }

    public Category(Integer id, String category_name) {
        this.id = id;
        this.category_name = category_name;
    }

    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                ", category_name='" + category_name + '\'' +
                '}';
    }

    public Category() {
    }
}
