package xmu.crms.coursemanagesystem.controller;

import org.springframework.web.bind.annotation.*;
import xmu.crms.coursemanagesystem.entity.Class;
import xmu.crms.coursemanagesystem.entity.Rule;
import xmu.crms.coursemanagesystem.entity.Student;
import xmu.crms.coursemanagesystem.vo.GetClassInfoVO;
import xmu.crms.coursemanagesystem.vo.GetClassVO;
import xmu.crms.coursemanagesystem.vo.Response;
import xmu.crms.coursemanagesystem.vo.Time;


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
        List<Class> classes = new ArrayList<Class>();
        Class class1 = new Class();
        class1.setId(23L);
        class1.setName("周三1-2节");
        class1.setSite("公寓405");
        return null;
    }

    @GetMapping("/class/{classId}")
    public GetClassInfoVO getClassInfo(@PathVariable("classId") int id) {
        GetClassInfoVO classInfo = new GetClassInfoVO();
        Time time = new Time();
        time.setWeek(1);
        time.setDay(1);
        List<Integer> lessons = new ArrayList<Integer>();
        lessons.add(1);
        lessons.add(2);
        time.setLessons(lessons);
        time.setSite("海韵201");
        List<Time> timeList = new ArrayList<Time>();
        timeList.add(time);
        classInfo.setTime(timeList);
        classInfo.setCalling(true);
        classInfo.setRoster("/roster/周三12班.xlsx");
        Rule properties = new Rule();
        properties.setId(1L);
        properties.setPercent3(20);
        properties.setPercent4(60);
        properties.setPercent5(20);
        properties.setReport(50);
        properties.setPresentation(50);
        classInfo.setProperties(properties);
        return classInfo;
    }

    @PutMapping("/class/{classId}")
    public Response modify(@PathVariable("classId") int classId, @RequestBody Class oldClass) {
        return new Response(204);
    }

    @DeleteMapping("/class/{classId}")
    public Response delete(@PathVariable("classId") int classId) {
        return new Response(204);
    }

    @GetMapping("/class/{classId}")
    public List<Student> getClassStudent(@PathVariable int classId) {
        List<Student> students = new ArrayList<Student>();
        return students;
    }


}
