package com.znbl.common.serviceImpl;

import com.znbl.common.entity.Topic;
import com.znbl.common.mapper.TopicMapper;
import com.znbl.common.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TopicServiceImpl implements TopicService {

    @Autowired
    TopicMapper topicMapper;

    //添加topic
    public void addTopic(Topic topic) {
        topicMapper.addTopic(topic);
    }

    //按分类查看topic
    public List<Topic> showByCategory() {
        return topicMapper.showByCategory();
    }


    //显示辩题详细信息
    public Topic getTopicById(Integer id) {
        return topicMapper.getTopicById(id);
    }
}
