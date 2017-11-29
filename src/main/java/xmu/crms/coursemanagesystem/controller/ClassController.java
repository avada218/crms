package xmu.crms.coursemanagesystem.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import xmu.crms.coursemanagesystem.entity.Rule;
import xmu.crms.coursemanagesystem.vo.GetClassInfoVO;
import xmu.crms.coursemanagesystem.vo.GetClassVO;
import xmu.crms.coursemanagesystem.vo.Time;


import java.util.ArrayList;
import java.util.List;

/**
 * @author badcode
 * @date 2017/11/29
 */
@RestController
public class ClassController {

    @GetMapping("/course/{courseId}/class")
    public List<GetClassVO> getClasses(@PathVariable("courseId") int courseId) {
        List<GetClassVO> classes = new ArrayList<GetClassVO>();
        GetClassVO class1 = new GetClassVO();
        class1.setId(1L);
        class1.setName("周三1-2节");
        classes.add(class1);
        GetClassVO class2 = new GetClassVO();
        class2.setId(2L);
        class2.setName("周三3-4节");
        classes.add(class2);
        return classes;
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
}
