package xmu.crms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import xmu.crms.entity.SeminarGroup;
import xmu.crms.entity.Topic;
import xmu.crms.exception.TopicNotFoundException;
import xmu.crms.service.TopicService;
import xmu.crms.vo.Response;

import javax.servlet.http.HttpServletResponse;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author badcode
 * @date 2017/12/01
 *
 */
@RestController
@RequestMapping("/topic")
public class TopicController {

    @Autowired
    TopicService topicService;

    @GetMapping("/{topicId}")
    public Topic getTopic(@PathVariable("topicId") String topicId) throws TopicNotFoundException, IllegalArgumentException {
        BigInteger id = new BigInteger(topicId);
        return topicService.getTopicByTopicId(id);
    }

    @PutMapping("/{topicId}")
    public Response modifyTopic(@PathVariable("topicId") int topicId, @RequestBody Topic topic,
                                HttpServletResponse response) {
        response.setStatus(204);
        return null;
    }

    @DeleteMapping("/{topicId}")
    public Response deleteTopic(@PathVariable("topicId") int topicId, HttpServletResponse response) {
        response.setStatus(204);
        return null;
    }

    @GetMapping("/{topicId}/group")
    public List<SeminarGroup> getGroups(@PathVariable("topicId") int topicId) {
        List<SeminarGroup> groups = new ArrayList<>();
//        Group group1 = new Group();
//        group1.setId(23L);
//        group1.setName("1A1");
//        groups.add(group1);
//        Group group2 = new Group();
//        group2.setId(26L);
//        group2.setName("2A2");
//        groups.add(group2);
        return groups;
    }
}
