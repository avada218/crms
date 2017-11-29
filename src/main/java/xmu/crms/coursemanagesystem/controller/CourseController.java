package xmu.crms.coursemanagesystem.controller;

import org.springframework.web.bind.annotation.*;
import xmu.crms.coursemanagesystem.entity.Course;
import xmu.crms.coursemanagesystem.vo.AddCourseVO;
import xmu.crms.coursemanagesystem.vo.CourseInfoVO;
import xmu.crms.coursemanagesystem.vo.GetCourseVO;
import xmu.crms.coursemanagesystem.vo.Response;

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
    public Response modify(@ModelAttribute Course course) {
        return new Response(204);
    }

    @PostMapping("/course")
    public AddCourseVO add(@ModelAttribute Course course) {
        System.out.println(course.toString());
        AddCourseVO acvo = new AddCourseVO();
        acvo.setId(1L);
        return acvo;
    }

    @GetMapping("/course/{id}")
    public CourseInfoVO getCourseInfo(@PathVariable("id") int id) {
        CourseInfoVO courseInfo = new CourseInfoVO();
        courseInfo.setId(1L);
        courseInfo.setName("OOAD");
        courseInfo.setDescription("OOAD is OOAD!");
        return courseInfo;
    }
}
