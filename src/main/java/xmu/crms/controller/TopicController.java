package xmu.crms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import xmu.crms.entity.SeminarGroup;
import xmu.crms.entity.Topic;
import xmu.crms.exception.TopicNotFoundException;
import xmu.crms.service.TopicService;

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
    @ResponseStatus(HttpStatus.OK)
    public Topic getTopic(@PathVariable("topicId") String topicId) throws TopicNotFoundException, IllegalArgumentException {
        BigInteger id = new BigInteger(topicId);
        return topicService.getTopicByTopicId(id);
    }

    @PutMapping("/{topicId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void modifyTopic(@PathVariable("topicId") String topicId, @RequestBody Topic topic) throws TopicNotFoundException, IllegalArgumentException {
        BigInteger id = new BigInteger(topicId);
        topicService.updateTopicByTopicId(id, topic);
    }

    @DeleteMapping("/{topicId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteTopic(@PathVariable("topicId") String topicId) {
        topicService.deleteTopicByTopicId(new BigInteger(topicId));
    }

    @GetMapping("/{topicId}/group")
    public List<SeminarGroup> getGroups(@PathVariable("topicId") int topicId) {
        List<SeminarGroup> groups = new ArrayList<>();
        return groups;
    }
}
