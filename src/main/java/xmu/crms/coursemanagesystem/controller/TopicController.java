package xmu.crms.coursemanagesystem.controller;

import org.springframework.web.bind.annotation.*;
import xmu.crms.coursemanagesystem.entity.Group;
import xmu.crms.coursemanagesystem.entity.Topic;
import xmu.crms.coursemanagesystem.vo.Response;

import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

/**
 * @author badcode
 * @date 2017/12/01
 */
@RestController
public class TopicController {

    @GetMapping("/topic/{topicId}")
    public Topic getTopic(@PathVariable("topicId") int topicId) {
        Topic topic = new Topic();
        topic.setId(257L);
        topic.setSerial("A");
        topic.setName("领域模型与模块");
        topic.setDescription("Domain model与模块划分");
        topic.setGroupLeft(2);
        topic.setGroupLimit(5);
        topic.setGroupMemberLimit(6);
        return topic;
    }

    @PutMapping("/topic/{topicId}")
    public Response modifyTopic(@PathVariable("topicId") int topicId, @RequestBody Topic topic,
                                HttpServletResponse response) {
        response.setStatus(204);
        return null;
    }

    @DeleteMapping("/topic/{topicId}")
    public Response deleteTopic(@PathVariable("topicId") int topicId, HttpServletResponse response) {
        response.setStatus(204);
        return null;
    }

    @GetMapping("/topic/{topicId}/group")
    public List<Group> getGroups(@PathVariable("topicId") int topicId) {
        List<Group> groups = new ArrayList<>();
        Group group1 = new Group();
        group1.setId(23L);
        group1.setName("1A1");
        groups.add(group1);
        Group group2 = new Group();
        group2.setId(26L);
        group2.setName("2A2");
        groups.add(group2);
        return groups;
    }
}
