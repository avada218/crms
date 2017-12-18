package xmu.crms.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import xmu.crms.entity.Topic;
import xmu.crms.exception.InfoIllegalException;
import xmu.crms.exception.TopicNotFoundException;
import xmu.crms.mapper.TopicMapper;
import xmu.crms.service.TopicService;

import java.math.BigInteger;
import java.util.List;

public class TopicServiceImpl implements TopicService{

    @Autowired
    TopicMapper topicMapper;

    @Override
    public Topic getTopicByTopicId(BigInteger topicId) throws TopicNotFoundException, InfoIllegalException {
        Topic topic = topicMapper.getTopicByTopicId(topicId);
        return topic;
    }

    @Override
    public Boolean updateTopicByTopicId(BigInteger topicId, Topic topic) throws TopicNotFoundException, InfoIllegalException {
        return null;
    }

    @Override
    public Boolean deleteTopicByTopicId(BigInteger topicId, BigInteger seminarId) throws InfoIllegalException {
        return null;
    }

    @Override
    public List<Topic> listTopicBySeminarId(BigInteger seminarId) throws InfoIllegalException {
        return null;
    }

    @Override
    public BigInteger insertTopicBySeminarId(BigInteger seminarId, Topic topic) throws InfoIllegalException {
        return null;
    }

    @Override
    public Boolean deleteTopicById(BigInteger groupId, BigInteger topicId) throws InfoIllegalException {
        return null;
    }

    @Override
    public Boolean deleteSeminarGroupTopicByTopicId(BigInteger topicId) throws InfoIllegalException {
        return null;
    }

    @Override
    public Boolean deleteTopicBySeminarId(BigInteger seminarId) throws InfoIllegalException {
        return null;
    }
}
