package xmu.crms.coursemanagesystem.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import xmu.crms.coursemanagesystem.entity.Group;
import xmu.crms.coursemanagesystem.entity.Seminar;
import xmu.crms.coursemanagesystem.entity.Topic;
import xmu.crms.coursemanagesystem.vo.Response;

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
}
