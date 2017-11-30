package xmu.crms.coursemanagesystem.controller;

import org.springframework.web.bind.annotation.*;
import xmu.crms.coursemanagesystem.entity.Course;
import xmu.crms.coursemanagesystem.entity.Seminar;
import xmu.crms.coursemanagesystem.vo.*;

import javax.servlet.http.HttpServletResponse;
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
    public List<GetCourseVO> getCourses() {
        List<GetCourseVO> courses = new ArrayList<GetCourseVO>();
        GetCourseVO course1 = new GetCourseVO();
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

    @DeleteMapping("/course/{id}")
    public Response deleteCourse() {
        return new Response(204);
    }

    @PutMapping("/course/{id}")
    public Response modify(@RequestBody Course course) {
        return new Response(204);
    }

    @PostMapping("/course")
    public AddCourseVO add(@RequestBody Course course) {
        System.out.println(course.toString());
        AddCourseVO acvo = new AddCourseVO();
        acvo.setId(1L);
        return acvo;
    }

    @GetMapping("/course/{id}")
    public CourseInfoVO getCourseInfo(@PathVariable("id") int id, HttpServletResponse response) {
        CourseInfoVO courseInfo = new CourseInfoVO();
        courseInfo.setId(1L);
        courseInfo.setName("OOAD");
        courseInfo.setDescription("OOAD is OOAD!");
        response.setStatus(200);
        return courseInfo;
    }

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

    //TODO
    @PostMapping("/course/{courseId}/class")
    public Response addClass(@RequestBody Class newClass, @PathVariable("courseId") int courseId) {
        return null;
    }

    @GetMapping("/course/{courseId}/seminars")
    public List<GetSeminarVO> getSeminars(@PathVariable("courseId") int CourseId) {
        List<GetSeminarVO> seminars = new ArrayList<GetSeminarVO>();
        GetSeminarVO seminar1 = new GetSeminarVO();
        seminar1.setId(1L);
        seminar1.setName("界面原型设计");
        seminar1.setDescription("界面原型设计");
        seminar1.setGroupingMethod("fixed");
        Calendar calendar = Calendar.getInstance();
        calendar.set(2017,9,25);
        seminar1.setStartTime(calendar.getTime());
        calendar.set(2017,10,9);
        seminar1.setEndTime(calendar.getTime());
        seminars.add(seminar1);

        GetSeminarVO seminar2 = new GetSeminarVO();
        seminar2.setId(1L);
        seminar2.setName("界面原型设计");
        seminar2.setDescription("界面原型设计");
        seminar2.setGroupingMethod("fixed");
        calendar.set(2017,10,10);
        seminar2.setStartTime(calendar.getTime());
        calendar.set(2017,10,24);
        seminar2.setEndTime(calendar.getTime());
        seminars.add(seminar2);
        return seminars;
    }

    //TODO
    @PostMapping("/course/{courseId}/seminar")
    public Response addSeminar(@RequestBody Seminar seminar) {
        return null;
    }
}
