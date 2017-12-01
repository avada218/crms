package xmu.crms.coursemanagesystem.controller;

import org.springframework.web.bind.annotation.*;
import xmu.crms.coursemanagesystem.entity.*;
import xmu.crms.coursemanagesystem.entity.Class;
import xmu.crms.coursemanagesystem.vo.ClassAttendanceVO;
import xmu.crms.coursemanagesystem.vo.Response;


import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

/**
 * @author badcode
 * @date 2017/11/29
 */
@RestController
public class ClassController {

    //TODO
    @GetMapping("/class")
    public List<Class> getClasses() {
        return null;
    }

    @GetMapping("/class/{classId}")
    public Class getClassInfo(@PathVariable("classId") int id) {
        Class class1 = new Class();
        class1.setId(23L);
        class1.setName("周三1-2节");
        class1.setNumStudent(120);
        ClassTime timesite1 = new ClassTime();
        timesite1.setWeek(1);
        timesite1.setDay(1);
        List<Integer> lesssons = new ArrayList<Integer>();
        lesssons.add(1);
        lesssons.add(2);
        timesite1.setLesson(lesssons);
        timesite1.setSite("海韵201");
        ClassTime timesite2 = new ClassTime();
        timesite2.setWeek(0);
        timesite2.setDay(3);
        List<Integer> lesssons1 = new ArrayList<Integer>();
        lesssons1.add(3);
        lesssons1.add(4);
        timesite2.setLesson(lesssons1);
        timesite2.setSite("公寓405");
        List<ClassTime> sitetimes = new ArrayList<ClassTime>();
        sitetimes.add(timesite1);
        sitetimes.add(timesite2);
        class1.setTimeSite(sitetimes);
        class1.setCalling(Boolean.TRUE);
        class1.setRoster("/roster/周三12班.xlsx");
        Proportions proportions = new Proportions();
        proportions.setA(20);
        proportions.setB(60);
        proportions.setC(20);
        proportions.setReport(50);
        proportions.setPresentation(50);
        class1.setProportions(proportions);
        return class1;
    }

    @PutMapping("/class/{classId}")
    public Response modify(@PathVariable("classId") int classId, @RequestBody Class oldClass, HttpServletResponse response) {
        response.setStatus(204);
        Response responseBody = new Response("成功");
        return responseBody;
    }

    @DeleteMapping("/class/{classId}")
    public Response delete(@PathVariable("classId") int classId, HttpServletResponse response) {
        response.setStatus(204);
        Response responseBody = new Response("成功");
        return responseBody;
    }

    @GetMapping("/class/{classId}/student")
    public List<User> getClassStudent(@PathVariable int classId) {
        List<User> students = new ArrayList<User>();
        User student1 = new User();
        student1.setId(233L);
        student1.setName("张三");
        student1.setNumber("24320152202333");
        students.add(student1);
        User student2 = new User();
        student2.setId(245L);
        student2.setName("张八");
        student2.setNumber("24320152202334");
        students.add(student2);
        return students;
    }

    @GetMapping("/class/{id}/attendance")
    public ClassAttendanceVO getAttendance(@PathVariable("id") int id, HttpServletResponse response) {
        ClassAttendanceVO attendance = new ClassAttendanceVO();
        attendance.setNumPresent(4);
        List<User> present = new ArrayList<User>();
        User student1 = new User();
        student1.setId(2357L);
        student1.setName("张三");
        User student2 = new User();
        student2.setId(8232L);
        student2.setName("李四");
        present.add(student1);
        present.add(student2);
        attendance.setPresent(present);
        List<User> late = new ArrayList<User>();
        User student3 = new User();
        student3.setId(3412L);
        student3.setName("王五");
        User student4 = new User();
        student4.setId(5234L);
        student4.setName("王七九");
        late.add(student3);
        late.add(student4);
        attendance.setLate(late);
        List<User> absent = new ArrayList<User>();
        User student5 = new User();
        student5.setId(34L);
        student5.setName("张六");
        absent.add(student5);
        attendance.setAbsent(absent);
        return attendance;
    }

    @GetMapping("/class/{id}/classgroup")
    public ClassGroup getClassGroup(@PathVariable("id") int id) {
        ClassGroup classGroup = new ClassGroup();
        User leader = new User();
        leader.setId(2757L);
        leader.setName("张三");
        leader.setNumber("23320152202333");
        classGroup.setLeader(leader);
        List<User> members = new ArrayList<>();
        User member1 = new User();
        member1.setId(2756L);
        member1.setName("李四");
        member1.setNumber("23320152202443");
        User member2 = new User();
        member2.setId(2777L);
        member2.setName("王五");
        member2.setNumber("23320152202433");
        members.add(member1);
        members.add(member2);
        classGroup.setMembers(members);
        return classGroup;
    }
}
