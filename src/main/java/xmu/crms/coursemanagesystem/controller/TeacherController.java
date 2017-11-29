package xmu.crms.coursemanagesystem.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;
import xmu.crms.coursemanagesystem.entity.School;
import xmu.crms.coursemanagesystem.entity.Teacher;
import xmu.crms.coursemanagesystem.vo.Response;
import xmu.crms.coursemanagesystem.vo.TeacherVO;

/**
 * @author badcode
 * @date 2017/11/29
 */
@RestController
public class TeacherController {

    @GetMapping("/me")
    public TeacherVO getInfo() {
        Teacher teacher= new Teacher();
        School school = new School();
        school.setId(1L);
        school.setName("xmu");
        teacher.setId(1L);
        teacher.setAvatar("/avatar/teacher1.png");
        teacher.setEmail("123456@qq.com");
        teacher.setGender("male");
        teacher.setName("xxx");
        teacher.setNumber("123456");
        teacher.setSchool(school);
        teacher.setTitle("教授");
        teacher.setPhone("123456789");
        TeacherVO teacherVO = new TeacherVO(teacher);
        return teacherVO;
    }

    @PutMapping("/me")
    public Response modifyInfo(@ModelAttribute Teacher teacher) {
        System.out.println(teacher.toString());
        return new Response(204);
    }
}
