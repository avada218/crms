package xmu.crms.coursemanagesystem.controller;

import org.springframework.web.bind.annotation.*;
import xmu.crms.coursemanagesystem.entity.Class;
import xmu.crms.coursemanagesystem.entity.Course;
import xmu.crms.coursemanagesystem.entity.Seminar;
import xmu.crms.coursemanagesystem.vo.*;

import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 * @author badcode
 * @date 2017/11/29
 */
@RestController
public class CourseController {

    @GetMapping("/course")
    public List<Course> getCourses(HttpServletResponse response) {
        List<Course> courses = new ArrayList<Course>();
        Course course1 = new Course();
        course1.setId(1L);
        course1.setName("OOAD");
        course1.setNumClass(3);
        course1.setNumStudent(60);
        Calendar calendar = Calendar.getInstance();
        calendar.set(2017,8,1);
        course1.setStartTime(calendar.getTime());
        calendar.set(2018,0,1);
        course1.setEndTime(calendar.getTime());
        courses.add(course1);

        Course course2 = new Course();
        course2.setId(2L);
        course2.setName("J2EE");
        course2.setNumClass(1);
        course2.setNumStudent(60);
        calendar.set(2017,8,1);
        course2.setStartTime(calendar.getTime());
        calendar.set(2018,0,1);
        course2.setEndTime(calendar.getTime());
        courses.add(course2);
        response.setStatus(200);
        return courses;
    }

    @DeleteMapping("/course/{id}")
    public void deleteCourse(@PathVariable("id") int id, HttpServletResponse response) {
        response.setStatus(204);
    }

    @PutMapping("/course/{id}")
    public Response modify(@RequestBody Course course, HttpServletResponse response) {
        response.setStatus(204);
        return null;
    }

    @PostMapping("/course")
    public Course add(@RequestBody Course course, HttpServletResponse response) {
        System.out.println(course.toString());
        Course  newCourse = new Course();
        newCourse.setId(23L);
        response.setStatus(201);
        return newCourse;
    }

    @GetMapping("/course/{id}")
    public CourseDetail getCourseInfo(@PathVariable("id") int id) {
        CourseDetail courseDetail = new CourseDetail();
        courseDetail.setId(23L);
        courseDetail.setName("OOAD");
        courseDetail.setDescription("面向对象分析与设计");
        courseDetail.setTeacherName("邱明");
        courseDetail.setTeacherEmail("mingqiu@xmu.edu.cn");
        return courseDetail;
    }

    @GetMapping("/course/{courseId}/class")
    public List<Class> getClasses(@PathVariable("courseId") int courseId) {
        List<Class> classes = new ArrayList<Class>();
        Class class1 = new Class();
        class1.setId(45L);
        class1.setName("周三1-2节");
        classes.add(class1);
        Class class2 = new Class();
        class2.setId(48L);
        class2.setName("周三3-4节");
        classes.add(class2);
        return classes;
    }

    @PostMapping("/course/{courseId}/class")
    public Class addClass(@RequestBody Class newClass, @PathVariable("courseId") int courseId, HttpServletResponse response) {
        Class ret = new Class();
        ret.setId(45L);
        response.setStatus(201);
        return ret;
    }

    @GetMapping("/course/{courseId}/seminar")
    public List<Object> getSeminars(@PathVariable("courseId") int CourseId, @PathVariable("embedGrade") boolean embedGrade) {
        List<Seminar> seminars = new ArrayList<Seminar>();
        Seminar seminar1 = new Seminar();
        seminar1.setId(29L);
        seminar1.setName("界面原型设计");
        seminar1.setDescription("界面原型设计");
        seminar1.setGroupingMethod("fixed");
        Calendar calendar = Calendar.getInstance();
        calendar.set(2017,8,25);
        seminar1.setStartTime(calendar.getTime());
        calendar.set(2017,9,9);
        seminar1.setEndTime(calendar.getTime());
        seminars.add(seminar1);

        Seminar seminar2 = new Seminar();
        seminar2.setId(32L);
        seminar2.setName("概要设计");
        seminar2.setDescription("模型层与数据库设计");
        seminar2.setGroupingMethod("fixed");
        calendar.set(2017,9,10);
        seminar2.setStartTime(calendar.getTime());
        calendar.set(2017,9,24);
        seminar2.setEndTime(calendar.getTime());
        seminars.add(seminar2);
        return seminars;
    }

    @PostMapping("/course/{courseId}/seminar")
    public Seminar addSeminar(@RequestBody Seminar seminar, HttpServletResponse response) {
        Seminar newSeminar = new Seminar();
        newSeminar.setId(32L);
        response.setStatus(201);
        return newSeminar;
    }
}
