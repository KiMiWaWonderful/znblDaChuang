package com.znbl.common.mapper;

import com.znbl.common.entity.Topic;

import java.util.List;

//@Mapper
public interface TopicMapper {

    //添加topic
    public void addTopic(Topic topic);

    //按分类查看topic
    public List<Topic> showByCategory();

    //显示辩题详细信息
    public Topic getTopicById(Integer id);
}