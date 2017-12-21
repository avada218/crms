package xmu.crms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import xmu.crms.entity.FixGroup;
import xmu.crms.service.TopicService;
import xmu.crms.vo.Response;
import xmu.crms.vo.SelectTopicVO;
import xmu.crms.entity.Topic;
import xmu.crms.entity.User;

import javax.servlet.http.HttpServletResponse;
import java.math.BigInteger;


/**
 * @author badcode
 * @date 2017/11/30
 */
@RestController
@RequestMapping("/group")
public class GroupController {

    @Autowired
    private TopicService topicService;

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
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

    @PutMapping("/{groupId}/resign")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void leaderResign(@PathVariable("groupId") int groupId,
                                 @RequestBody User leader) {

    }

    @PutMapping("/{groupId}/assign")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void leaderAssign(@PathVariable("groupId") int groupId,
                                 @RequestBody User leader) {

    }

    @PutMapping("/{groupId}/remove")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void removeMember(@PathVariable("groupId") int groupId,
                                 @RequestBody User leader) {

    }

    @PutMapping("/{groupId}/add")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void addMember(@PathVariable("groupId") int groupId,
                              @RequestBody User leader) {

    }

    @PostMapping("/{groupId}/topic")
    @ResponseStatus(HttpStatus.CREATED)
    public SelectTopicVO selectTopic(@PathVariable("groupId") int groupId, @RequestBody Topic topic) {
        SelectTopicVO ret = new SelectTopicVO();
        ret.setUrl("/27/topic/23");
        return ret;
    }

    @DeleteMapping("/{groupId}/topic/{topicId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void cancelTopicSelection(@PathVariable("groupId") String groupId,
                                          @PathVariable("topicId") String topicId) {
        topicService.deleteTopicById(new BigInteger(groupId), new BigInteger(topicId));
    }

    @GetMapping("/{groupId}/grade")
    @ResponseStatus(HttpStatus.OK)
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

    @PutMapping("/{groupId}/grade/report")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void setGrade(@PathVariable("groupId") int groupId) {

    }

    @PutMapping("/{groupId}/grade/presentation/{studentId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void studentSetGrade(@PathVariable("groupId") int groupId, @PathVariable("studentId") int studentId) {

    }
}
