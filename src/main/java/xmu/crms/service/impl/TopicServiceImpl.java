package xmu.crms.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xmu.crms.dao.SeminarGroupTopicDAO;
import xmu.crms.dao.TopicDAO;
import xmu.crms.entity.Seminar;
import xmu.crms.entity.SeminarGroup;
import xmu.crms.entity.SeminarGroupTopic;
import xmu.crms.entity.Topic;
import xmu.crms.exception.TopicNotFoundException;
import xmu.crms.service.TopicService;

import java.math.BigInteger;
import java.util.Iterator;
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

    @Autowired
    SeminarGroupTopicDAO seminarGroupTopicDAO;

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
        if (topicId.intValue() <= 0) {
            IllegalArgumentException exception = new IllegalArgumentException("topicId");
            throw exception;
        }
        topic.setId(topicId);
        return topicDAO.updateTopicByTopicId(topic);
    }

    @Override
    public Boolean deleteTopicByTopicId(BigInteger topicId) throws IllegalArgumentException {
        if (topicId.intValue() <= 0) {
            throw new IllegalArgumentException("topicId");
        }
        //删除所有与该topic相关的选题记录
        if (!deleteSeminarGroupTopicByTopicId(topicId)) {
            return false;
        }
        //删除该topic
        Topic topic = new Topic();
        topic.setId(topicId);
        return topicDAO.deleteTopicByTopicId(topic);
    }

    @Override
    public List<Topic> listTopicBySeminarId(BigInteger seminarId) throws IllegalArgumentException {
        if (seminarId.intValue() < 0) {
            throw new IllegalArgumentException("seminarId");
        }
        Seminar seminar = new Seminar();
        seminar.setId(seminarId);
        return topicDAO.listTopicBySeminarId(seminar);
    }

    @Override
    public BigInteger insertTopicBySeminarId(BigInteger seminarId, Topic topic) throws IllegalArgumentException {
        if (seminarId.intValue() < 0) {
            throw new IllegalArgumentException("seminarId");
        }
        Seminar seminar = new Seminar();
        seminar.setId(seminarId);
        topic.setSeminar(seminar);
        return topicDAO.insertTopicBySeminarId(topic);
    }

    @Override
    public Boolean deleteTopicById(BigInteger groupId, BigInteger topicId) throws IllegalArgumentException {
        if (groupId.intValue() <= 0) {
            throw new IllegalArgumentException("groupId");
        }
        if (topicId.intValue() <= 0) {
            throw new IllegalArgumentException("topicId");
        }

        SeminarGroup seminarGroup = new SeminarGroup();
        seminarGroup.setId(groupId);
        Topic topic = new Topic();
        topic.setId(topicId);
        SeminarGroupTopic seminarGroupTopic = new SeminarGroupTopic();
        seminarGroupTopic.setSeminarGroup(seminarGroup);
        seminarGroupTopic.setTopic(topic);
        return seminarGroupTopicDAO.deleteByGroupAndTopic(seminarGroupTopic);
    }

    @Override
    public Boolean deleteSeminarGroupTopicByTopicId(BigInteger topicId) throws IllegalArgumentException {
        if (topicId.intValue() <= 0) {
            throw new IllegalArgumentException("topicId");
        }
        Topic topic = new Topic();
        topic.setId(topicId);
        return seminarGroupTopicDAO.deleteByTopic(topic);
    }

    @Override
    public Boolean deleteTopicBySeminarId(BigInteger seminarId) throws IllegalArgumentException {
        if (seminarId.intValue() <= 0) {
            throw new IllegalArgumentException("seminarId");
        }
        Seminar seminar = new Seminar();
        seminar.setId(seminarId);
        List<Topic> topicList = topicDAO.listTopicBySeminarId(seminar);
        Iterator<Topic> iterator = topicList.iterator();
        while (iterator.hasNext()) {
            Topic topic = iterator.next();
            if (!deleteTopicByTopicId(topic.getId())) {
                return false;
            }
        }
        return true;
    }

    @Override
    public SeminarGroupTopic getSeminarGroupTopicById(BigInteger topicId, BigInteger groupId) throws IllegalArgumentException
    {
        SeminarGroupTopic seminarGroupTopic=new SeminarGroupTopic();
        return seminarGroupTopic;
    }
}
