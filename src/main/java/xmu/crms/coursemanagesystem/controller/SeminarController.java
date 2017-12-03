package xmu.crms.coursemanagesystem.controller;

import org.springframework.web.bind.annotation.*;
import xmu.crms.coursemanagesystem.entity.Group;
import xmu.crms.coursemanagesystem.entity.Seminar;
import xmu.crms.coursemanagesystem.entity.Topic;
import xmu.crms.coursemanagesystem.vo.Response;
import xmu.crms.coursemanagesystem.vo.StudentSeminar;

import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 * @author badcode
 * @date 2017/11/29
 */
@RestController
public class SeminarController {

    @GetMapping("/seminar/{id}")
    public Seminar getSeminarInfo(@PathVariable("id") int id) {
        Seminar seminar = new Seminar();
        seminar.setId(32L);
        seminar.setName("概要设计");
        seminar.setDescription("模型层与数据库设计");
        seminar.setGroupingMethod("fixed");
        Calendar calendar = Calendar.getInstance();
        calendar.set(2017,9,10);
        seminar.setStartTime(calendar.getTime());
        calendar.set(2017,9,24);
        seminar.setEndTime(calendar.getTime());
        List<Topic> topics = new ArrayList<>();
        Topic topic = new Topic();
        topic.setId(257L);
        topic.setName("领域模型与模块");
        topics.add(topic);
        seminar.setTopics(topics);
        return seminar;
    }

    @GetMapping("/seminar/{seminarId}/my")
    public StudentSeminar getRelatedSeminar() {
        StudentSeminar seminar = new StudentSeminar();
        seminar.setId(32L);
        seminar.setName("概要设计");
        seminar.setGroupingMethond("random");
        seminar.setCourseName("OOAD");
        Calendar calendar = Calendar.getInstance();
        calendar.set(2017,9,11);
        seminar.setStartTime(calendar.getTime());
        calendar.set(2017,9,24);
        seminar.setEndTime(calendar.getTime());
        seminar.setClassCalling(-1);
        seminar.setLeader(true);
        seminar.setAreTopicsSelected(true);
        return seminar;
    }

    @GetMapping("/seminar/{id}/topic")
    public List<Topic> getTopics(@PathVariable("id") int id) {
        List<Topic> topics = new ArrayList<Topic>();
        Topic topic = new Topic();
        topic.setId(257L);
        topic.setName("领域模型与模块");
        topic.setDescription("Domain model与模块划分");
        topic.setGroupLeft(2);
        topic.setGroupLimit(5);
        topics.add(topic);
        return topics;
    }

    @GetMapping("/seminar/{id}/group")
    public List<Group> getGroups(@PathVariable("id") int id) {
        List<Group> groups = new ArrayList<>();
        Group group = new Group();
        group.setId(28L);
        groups.add(group);
        return groups;
    }

    @DeleteMapping("/seminar/{id}")
    public Response deleteSeminar(@PathVariable("id") int id, HttpServletResponse response) {
        response.setStatus(204);
        return null;
    }

    @PutMapping("/seminar/{seminarId}")
    public Response modifySeminar(@PathVariable("seminarId") int seminarId, @RequestBody Seminar seminar,
                                  HttpServletResponse response) {
        response.setStatus(204);
        return null;
    }

    @PostMapping("/seminar/{seminarId}/topic")
    public Topic addTopic(@PathVariable("seminarId") int seminarId, @RequestBody Topic topic,
                          HttpServletResponse response) {
        Topic newTopic = new Topic();
        newTopic.setId(257L);
        response.setStatus(201);
        return newTopic;
    }
}
