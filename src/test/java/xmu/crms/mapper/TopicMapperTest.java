package xmu.crms.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import xmu.crms.entity.Topic;

import java.math.BigInteger;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TopicMapperTest {

    @Autowired
    private TopicMapper topicMapper;

    @Test
    public void testGetTopicByTopicId() {
        Topic topic = new Topic();
        topic.setId(BigInteger.valueOf(1L));
        System.out.println(topicMapper.getTopicByTopicId(topic));
    }
}
