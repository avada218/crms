package xmu.crms.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import xmu.crms.entity.Topic;

import java.math.BigInteger;

/**
 *
 * @author badcode
 * @date 2017/12/18
 *
 */
@Mapper
@Component
public interface TopicMapper {

    /**
     *
     * get topic by topic id
     *
     * @param id topicId
     * @return Topic
     *
     */
    Topic getTopicByTopicId(BigInteger id);

    /**
     *
     * update topic by topicId
     *
     * @param topic 话题信息
     *
     */
    void updateTopicByTopicId(Topic topic);
}
