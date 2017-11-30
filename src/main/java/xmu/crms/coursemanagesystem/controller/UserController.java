package xmu.crms.coursemanagesystem.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;
import xmu.crms.coursemanagesystem.entity.School;
import xmu.crms.coursemanagesystem.entity.User;
import xmu.crms.coursemanagesystem.vo.Response;
import xmu.crms.coursemanagesystem.vo.TeacherVO;

/**
 * @author badcode
 * @date 2017/11/29
 */
@RestController
public class UserController {

    @GetMapping("/me")
    public TeacherVO getInfo() {
        User user = new User();
        School school = new School();
        school.setId(1L);
        school.setName("xmu");
        user.setId(1L);
        user.setAvatar("/avatar/teacher1.png");
        user.setEmail("123456@qq.com");
        user.setGender("male");
        user.setName("xxx");
        user.setNumber("123456");
        user.setSchool(school);
        user.setTitle("教授");
        user.setPhone("123456789");
        TeacherVO teacherVO = new TeacherVO(user);
        return teacherVO;
    }

    @PutMapping("/me")
    public Response modifyInfo(@ModelAttribute User user) {
        System.out.println(user.toString());
        return new Response(204);
    }
}
