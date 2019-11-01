package com.znbl.common.service;

import com.znbl.common.entity.Topic;

import java.util.List;

public interface TopicService {

    //添加topic
    public void addTopic(Topic topic);

    //按分类查看topic
    public List<Topic> showByCategory();

    //显示辩题详细信息
    public Topic getTopicById(Integer id);
}
