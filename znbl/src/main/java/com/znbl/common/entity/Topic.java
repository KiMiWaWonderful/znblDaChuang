package com.znbl.common.entity;

public class Topic {

    Integer id;
    //辩题题目
    String title;
    //内容
    String content;
    //分类
    //String category_name;
    Category category;
    //分类的id,添加时要用
    Integer c_id;

    public Integer getC_id() {
        return c_id;
    }

    public void setC_id(Integer c_id) {
        this.c_id = c_id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

//    public String getCategory_name() {
//        return category_name;
//    }
//
//    public void setCategory_name(String category_name) {
//        this.category_name = category_name;
//    }


    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Topic() {
    }

    public Topic(Integer id, String title, String content, Category category, Integer c_id) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.category = category;
        this.c_id = c_id;
    }
}
