package xmu.crms.controller;

import org.springframework.web.bind.annotation.*;
import xmu.crms.entity.FixGroup;
import xmu.crms.vo.Response;
import xmu.crms.vo.SelectTopicVO;
import xmu.crms.entity.Topic;
import xmu.crms.entity.User;

import javax.servlet.http.HttpServletResponse;


@RestController
/**
 * @author badcode
 * @date 2017/11/30
 */
public class GroupController {

    @GetMapping("/group/{id}")
    public FixGroup getGroupInfo(@PathVariable("id") int id) {
//        Group group = new Group();
//        group.setId(28L);
//        User leader = new User();
//        leader.setId(8888L);
//        leader.setName("张三");
//        group.setLeader(leader);
//        List<User> members = new ArrayList<>();
//        User member1 = new User();
//        member1.setId(5324L);
//        member1.setName("李四");
//        User member2 = new User();
//        member2.setId(5678L);
//        member2.setName("王五");
//        members.add(member1);
//        members.add(member2);
//        group.setMembers(members);
//        List<Topic> topics = new ArrayList<>();
//        Topic topic = new Topic();
//        topic.setId(257L);
//        topic.setName("领域模型与模块");
//        topics.add(topic);
//        group.setTopics(topics);
//        group.setReport("");
        return null;
    }

    @PutMapping("/group/{groupId}/resign")
    public Response leaderResign(@PathVariable("groupId") int groupId,
                                 @RequestBody User leader, HttpServletResponse response) {
        response.setStatus(204);
        return null;
    }

    @PutMapping("/group/{groupId}/assign")
    public Response leaderAssign(@PathVariable("groupId") int groupId,
                                 @RequestBody User leader, HttpServletResponse response) {
        response.setStatus(204);
        return null;
    }

    @PutMapping("/group/{groupId}/remove")
    public Response removeMember(@PathVariable("groupId") int groupId,
                                 @RequestBody User leader, HttpServletResponse response) {
        response.setStatus(204);
        return null;
    }

    @PutMapping("/group/{groupId}/add")
    public Response addMember(@PathVariable("groupId") int groupId,
                              @RequestBody User leader, HttpServletResponse response) {
        response.setStatus(204);
        return null;
    }

    @PostMapping("/group/{groupId}/topic")
    public SelectTopicVO selectTopic(@PathVariable("groupId") int groupId, @RequestBody Topic topic,
                                     HttpServletResponse response) {
        SelectTopicVO ret = new SelectTopicVO();
        ret.setUrl("/group/27/topic/23");
        response.setStatus(201);
        return ret;
    }

    @DeleteMapping("/group/{groupId}/topic/{topicId}")
    public Response cancelTopicSelection(@PathVariable("groupId") int groupId,
                                          @PathVariable("topicId") int topicId,
                                          HttpServletResponse response) {
        response.setStatus(204);
        return null;
    }

    @GetMapping("/group/{groupId}/grade")
    public Object getGrade(@PathVariable("groupId") int groupId){
//        SeminarGrade grade = new SeminarGrade();
//        List<TopicGrade> presentationGrade = new ArrayList<>();
//        TopicGrade topicGrade1 = new TopicGrade();
//        topicGrade1.setTopicId(257);
//        topicGrade1.setGrade(4);
//        presentationGrade.add(topicGrade1);
//        TopicGrade topicGrade2 = new TopicGrade();
//        topicGrade2.setTopicId(285);
//        topicGrade2.setGrade(5);
//        presentationGrade.add(topicGrade1);
//        grade.setPresentationGrade(presentationGrade);
//        grade.setReportGrade(3);
//        grade.setGrade(4);
        return null;
    }

    @PutMapping("/group/{groupId}/grade/report")
    public Response setGrade(@PathVariable("groupId") int groupId,
                             HttpServletResponse response) {
        response.setStatus(204);
        return null;
    }

    @PutMapping("/group/{groupId}/grade/presentation/{studentId}")
    public Response studentSetGrade(@PathVariable("groupId") int groupId, @PathVariable("studentId") int studentId,
                                    HttpServletResponse response) {
        response.setStatus(204);
        return null;
    }
}
