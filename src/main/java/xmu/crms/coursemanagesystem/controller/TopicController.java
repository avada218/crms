package xmu.crms.coursemanagesystem.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import xmu.crms.coursemanagesystem.entity.Group;
import xmu.crms.coursemanagesystem.entity.Topic;

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
}
