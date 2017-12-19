package xmu.crms.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import xmu.crms.entity.Topic;
import xmu.crms.exception.TopicNotFoundException;
import xmu.crms.mapper.TopicMapper;
import xmu.crms.service.TopicService;

import java.math.BigInteger;

/**
 *
 * @author badcode
 * @date 2017/12/19
 *
 */
@Component
public class TopicDAO {

    @Autowired
    TopicMapper topicMapper;

    public Topic getTopicByTopicId(BigInteger id) throws TopicNotFoundException {
        Topic topic = topicMapper.getTopicByTopicId(id);
        if (null == topic) {
            throw new TopicNotFoundException();
        }
        return topic;
    }
}
