package xmu.crms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import xmu.crms.entity.*;
import xmu.crms.exception.*;
import xmu.crms.service.*;
import xmu.crms.vo.*;

import javax.servlet.http.HttpServletResponse;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 * @author badcode
 * @date 2017/11/29
 */
@RestController
@RequestMapping("/seminar")
public class SeminarController {

    @Autowired
    private SeminarService seminarService;

    @Autowired
    private CourseService courseService;

    @Autowired
    private SeminarGroupService seminarGroupService;

    @Autowired
    private TopicService topicService;

    @Autowired
    private UserService userService;

//    @Autowired
//    private Attendance

    @GetMapping("/{seminarId}")
    @ResponseStatus(HttpStatus.OK)
    public Seminar getSeminarInfo(@PathVariable("seminarId") String seminarId) throws SeminarNotFoundException {
        Seminar seminar = seminarService.getSeminarBySeminarId(new BigInteger(seminarId));
        return seminar;
    }

    @PutMapping("/{seminarId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void modifySeminar(@PathVariable("seminarId") String seminarId, @RequestBody Seminar seminar)
            throws SeminarNotFoundException {
        seminarService.updateSeminarBySeminarId(new BigInteger(seminarId), seminar);
    }

    @DeleteMapping("/{seminarId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteSeminar(@PathVariable("seminarId") String seminarId) throws SeminarNotFoundException {
        seminarService.deleteSeminarBySeminarId(new BigInteger(seminarId));
    }

    @GetMapping("/{seminarId}/my")
    @ResponseStatus(HttpStatus.OK)
    public StudentSeminar getRelatedSeminar(@PathVariable("seminarId") String seminarId)
            throws SeminarNotFoundException, CourseNotFoundException, ClassNotFoundException, GroupNotFoundException {

        StudentSeminar studentSeminar = new StudentSeminar();
        Seminar seminar = seminarService.getSeminarBySeminarId(new BigInteger(seminarId));
        studentSeminar.setId(seminar.getId().longValue());
        studentSeminar.setName(seminar.getName());
        if (seminar.getFixed() == true) {
            studentSeminar.setGroupingMethond("fixed");
        } else {
            studentSeminar.setGroupingMethond("random");
        }

        Course course = courseService.getCourseByCourseId(seminar.getCourse().getId());
        studentSeminar.setCourseName(course.getName());

        studentSeminar.setStartTime(seminar.getStartTime());
        studentSeminar.setEndTime(seminar.getEndTime());

        //todo
        BigInteger userId = new BigInteger("1");

        BigInteger classId = new BigInteger("-1");
        List<ClassInfo> classInfos = courseService.listClassByUserId(userId);
        for (ClassInfo classInfo : classInfos
                ) {
            if (classInfo.getCourse().getId().equals(course.getId())) {
                classId = classInfo.getId();
                studentSeminar.setClassCalling(classId.intValue());
                break;
            }
        }

        BigInteger leaderId = seminarGroupService.getSeminarGroupLeaderById(userId, new BigInteger(seminarId));
        if (userId.equals(leaderId)) {
            studentSeminar.setLeader(true);
        } else {
            studentSeminar.setLeader(false);
        }
        List<Topic> topics = topicService.listTopicBySeminarId(new BigInteger(seminarId));
        SeminarGroup seminarGroup = seminarGroupService.getSeminarGroupById(new BigInteger(seminarId), userId);
        BigInteger grouopId = seminarGroup.getId();
        Boolean areTopicsSelected=false;
        for (Topic topic : topics
                ) {
            SeminarGroupTopic seminarGroupTopic=topicService.getSeminarGroupTopicById(topic.getId(),grouopId);
            if(seminarGroupTopic!=null){
                areTopicsSelected=true;
                break;
            }
        }
        studentSeminar.setAreTopicsSelected(areTopicsSelected);

        return studentSeminar;
    }

    @GetMapping("/{seminarId}/detail")
    @ResponseStatus(HttpStatus.OK)
    public SeminarDetail getSeminarDetail(@PathVariable("seminarId") String seminarId)
            throws SeminarNotFoundException,CourseNotFoundException,
            ClassNotFoundException,ClassesNotFoundException,UserNotFoundException {
        SeminarDetail seminarDetail = new SeminarDetail();

        //todo
        BigInteger userId=new BigInteger("8");

        Seminar seminar=seminarService.getSeminarBySeminarId(new BigInteger(seminarId));
        seminarDetail.setId(seminar.getId().longValue());
        seminarDetail.setName(seminar.getName());
        seminarDetail.setStartTime(seminar.getStartTime());
        seminarDetail.setEndTime(seminar.getEndTime());

        Course course=courseService.getCourseByCourseId(seminar.getCourse().getId());
        List<ClassInfo> classInfos=courseService.listClassByUserId(userId);
        ClassInfo classInfo=new ClassInfo();
        for (ClassInfo classInfo1:classInfos
             ) {
            if(classInfo1.getCourse().getId().equals(course.getId())){
                classInfo=classInfo1;
                break;
            }
        }
        if(classInfo==null){
            throw new ClassesNotFoundException();
        }
        else{
            seminarDetail.setSite(classInfo.getSite());
        }

        User teacher=userService.getUserByUserId(course.getTeacher().getId());
        seminarDetail.setTeacherName(teacher.getName());
        seminarDetail.setTeacherEmail(teacher.getEmail());

        return seminarDetail;
    }

//    @GetMapping("/{seminarId}/topic")
//    @ResponseStatus(HttpStatus.OK)
//    public List<Topic> getTopics(@PathVariable("seminarId") String seminarId) throws IllegalArgumentException {
//        return topicService.listTopicBySeminarId(new BigInteger(seminarId));
//    }
//
//    @PostMapping("/{seminarId}/topic")
//    @ResponseStatus(HttpStatus.CREATED)
//    public Topic addTopic(@PathVariable("seminarId") String seminarId, @RequestBody Topic topic) {
//        BigInteger id = topicService.insertTopicBySeminarId(new BigInteger(seminarId), topic);
//        Topic newTopic = new Topic();
//        newTopic.setId(id);
//        return newTopic;
//    }

    @GetMapping("/{seminarId}/group")
    @ResponseStatus(HttpStatus.OK)
    public List<SeminarGroupVO> getGroups(@PathVariable("seminarId") String seminarId) throws SeminarNotFoundException {

        List<SeminarGroupVO> seminarGroupVOS=new ArrayList<>();

        List<SeminarGroup> seminarGroups=seminarGroupService.listSeminarGroupBySeminarId(new BigInteger(seminarId));
        for (SeminarGroup seminarGroup:seminarGroups
             ) {
            SeminarGroupVO seminarGroupVO=new SeminarGroupVO();
            seminarGroupVO.setId(seminarGroup.getId().longValue());

        }


        return seminarGroupVOS;
    }

    @GetMapping("/{seminarId}/group/my")
    @ResponseStatus(HttpStatus.OK)
    public SeminarGroup getMyGroup(@PathVariable("seminarId") int seminarId) {
        SeminarGroup group = new SeminarGroup();
//        group.setId(28L);
//        group.setName("28");
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
        return group;
    }

    @GetMapping("/{seminarId}/class/{classId}/attendance")
    @ResponseStatus(HttpStatus.OK)
    public AttendanceStatus getAttendanceStatus(@PathVariable("seminarId") int seminarId,
                                                @PathVariable("classId") int classId) {
        AttendanceStatus attendanceStatus = new AttendanceStatus();
        attendanceStatus.setNumPresent(40);
        attendanceStatus.setNumStudent(60);
        attendanceStatus.setGroup("grouping");
        attendanceStatus.setStatus("calling");
        return attendanceStatus;
    }

    @GetMapping("seminar/{seminarId}/class/{classId}/attendance/present")
    @ResponseStatus(HttpStatus.OK)
    public List<User> getPresent(@PathVariable("seminarId") int seminarId,
                                 @PathVariable("classId") int classId) {
        List<User> present = new ArrayList<>();
//        User student1 = new User();
//        student1.setId(2357L);
//        student1.setName("张三");
//        present.add(student1);
//        User student2 = new User();
//        student2.setId(8232L);
//        student2.setName("李四");
//        present.add(student2);
        return present;
    }

    @GetMapping("/{seminarId}/class/{classId}/attendance/late")
    @ResponseStatus(HttpStatus.OK)
    public List<User> getLate(@PathVariable("seminarId") int seminarId,
                              @PathVariable("classId") int classId) {
        List<User> late = new ArrayList<>();
//        User student1 = new User();
//        student1.setId(3412L);
//        student1.setName("王五");
//        late.add(student1);
//        User student2 = new User();
//        student2.setId(5234L);
//        student2.setName("王七九");
//        late.add(student2);
        return late;
    }

    @GetMapping("/{seminarId}/class/{classId}/attendance/absent")
    @ResponseStatus(HttpStatus.OK)
    public List<User> getAbsent(@PathVariable("seminarId") int seminarId,
                                @PathVariable("classId") int classId) {
        List<User> absent = new ArrayList<>();
        User student1 = new User();
//        student1.setId(34L);
        student1.setName("张六");
        absent.add(student1);
        return absent;
    }

    @PutMapping("/{seminarId}/class/{classId}/attendance/{studentId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public Status signIn(@PathVariable("seminarId") int seminarId,
                         @PathVariable("studentId") int studentId,
                         @RequestBody SiteVO site, HttpServletResponse response) {
        response.setStatus(200);
        Status status = new Status();
        status.setStatus("late");
        return status;
    }
}
