package xmu.crms.coursemanagesystem.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import xmu.crms.coursemanagesystem.entity.*;
import xmu.crms.coursemanagesystem.vo.Response;
import xmu.crms.coursemanagesystem.vo.TopicGrade;

import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;


@RestController
/**
 * @author badcode
 * @date 2017/11/30
 */
public class GroupController {
    @GetMapping("/group/{groupId}/grade")
    public SeminarGrade getGrade(){
        SeminarGrade grade = new SeminarGrade();
        List<TopicGrade> presentationGrade = new ArrayList<>();
        TopicGrade topicGrade1 = new TopicGrade();
        topicGrade1.setTopicId(257);
        topicGrade1.setGrade(4);
        presentationGrade.add(topicGrade1);
        TopicGrade topicGrade2 = new TopicGrade();
        topicGrade2.setTopicId(285);
        topicGrade2.setGrade(5);
        presentationGrade.add(topicGrade1);
        grade.setPresentationGrade(presentationGrade);
        grade.setReportGrade(3);
        grade.setGrade(4);
        return grade;
    }

    @GetMapping("/group/{id}")
    public Group getGroupInfo(@PathVariable("id") int id) {
        Group group = new Group();
        group.setId(28L);
        User leader = new User();
        leader.setId(8888L);
        leader.setName("张三");
        group.setLeader(leader);
        List<User> members = new ArrayList<>();
        User member1 = new User();
        member1.setId(5324L);
        member1.setName("李四");
        User member2 = new User();
        member2.setId(5678L);
        member2.setName("王五");
        members.add(member1);
        members.add(member2);
        group.setMembers(members);
        List<Topic> topics = new ArrayList<>();
        Topic topic = new Topic();
        topic.setId(257L);
        topic.setName("领域模型与模块");
        topics.add(topic);
        group.setTopics(topics);
        group.setReport("");
        return group;
    }

    @DeleteMapping("/group/{groupId}/topic/{topicId}")
    public Response cancelTopicSelection(@PathVariable("groupId") int groupId,
                                          @PathVariable("topicId") int topicId,
                                          HttpServletResponse response) {
        response.setStatus(204);
        return null;
    }
}
