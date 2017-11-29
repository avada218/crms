package xmu.crms.coursemanagesystem.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import xmu.crms.coursemanagesystem.entity.Course;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * @author badcode
 * @date 2017/11/29
 */
@RestController
public class CourseController {

    @GetMapping("/course")
    public List<Course> getCourses() {
        List<Course> courses = new ArrayList<Course>();
        Course course1 = new Course();
        course1.setId(1L);
        course1.setName("OOAD");
        course1.setNumClass(3);
        course1.setNumStudent(60);
        Calendar calendar = Calendar.getInstance();
        calendar.set(2017,9,1);
        course1.setStartTime(calendar.getTime());
        calendar.set(2018,1,1);
        course1.setEndTime(calendar.getTime());
        courses.add(course1);
        return courses;
    }
}
