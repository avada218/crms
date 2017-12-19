package xmu.crms.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xmu.crms.dao.TopicDAO;
import xmu.crms.entity.Topic;
import xmu.crms.exception.TopicNotFoundException;
import xmu.crms.mapper.TopicMapper;
import xmu.crms.service.TopicService;

import java.math.BigInteger;
import java.util.List;

/**
 *
 * @author badcode
 * @date 2017/12/19
 *
 */
@Service
public class TopicServiceImpl implements TopicService {

    @Autowired
    private TopicDAO topicDAO;

    @Override
    public Topic getTopicByTopicId(BigInteger topicId) throws TopicNotFoundException, IllegalArgumentException {
        if (topicId.intValue() <= 0) {
            IllegalArgumentException exception = new IllegalArgumentException("topicId");
            throw exception;
        }
        return topicDAO.getTopicByTopicId(topicId);
    }

    @Override
    public Boolean updateTopicByTopicId(BigInteger topicId, Topic topic) throws TopicNotFoundException, IllegalArgumentException {
        return null;
    }

    @Override
    public Boolean deleteTopicByTopicId(BigInteger topicId, BigInteger seminarId) throws IllegalArgumentException {
        return null;
    }

    @Override
    public List<Topic> listTopicBySeminarId(BigInteger seminarId) throws IllegalArgumentException {
        return null;
    }

    @Override
    public BigInteger insertTopicBySeminarId(BigInteger seminarId, Topic topic) throws IllegalArgumentException {
        return null;
    }

    @Override
    public Boolean deleteTopicById(BigInteger groupId, BigInteger topicId) throws IllegalArgumentException {
        return null;
    }

    @Override
    public Boolean deleteSeminarGroupTopicByTopicId(BigInteger topicId) throws IllegalArgumentException {
        return null;
    }

    @Override
    public Boolean deleteTopicBySeminarId(BigInteger seminarId) throws IllegalArgumentException {
        return null;
    }
}
