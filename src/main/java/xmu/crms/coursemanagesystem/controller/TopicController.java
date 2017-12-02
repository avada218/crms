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

    @GetMapping("/topic/{id}")
    public Topic getTopic(@PathVariable("id") int id) {
        Topic topic = new Topic();
        topic.setId(257L);
        topic.setName("领域模型与模块");
        topic.setDescription("Domain model与模块划分");
        topic.setGroupLeft(2);
        topic.setGroupLimit(5);
        return topic;
    }

    @GetMapping("/topic/{id}/group")
    public List<Group> getGroups(@PathVariable("id") int id) {
        List<Group> groups = new ArrayList<>();
        Group group1 = new Group();
        group1.setId(23L);
        groups.add(group1);
        Group group2 = new Group();
        group2.setId(26L);
        groups.add(group2);
        return groups;
    }

    @DeleteMapping("/topic/{id}")
    public Response deleteTopic(@PathVariable("id") int id, HttpServletResponse response) {
        response.setStatus(204);
        return null;
    }

    @PutMapping("/topic/{topicId}")
    public Response modifyTopic(@PathVariable("topicId") int topicId, @RequestBody Topic topic,
                                HttpServletResponse response) {
        response.setStatus(204);
        return null;
    }
}
