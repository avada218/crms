package xmu.crms.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import xmu.crms.entity.School;
import xmu.crms.entity.User;
import xmu.crms.vo.Response;

import javax.servlet.http.HttpServletResponse;

/**
 * @author badcode
 * @date 2017/11/29
 */
@RestController
public class UserController {

    @GetMapping("/me")
    @ResponseStatus(HttpStatus.OK)
    public User getInfo() {
        User user = new User();
//        School school = new School();
//        school.setId(32L);
//        school.setName("厦门大学");
//        user.setId(3486L);
//        user.setAvatar("/avatar/3486.png");
//        user.setEmail("xxxxx@xx.com");
//        user.setGender("male");
//        user.setName("XXX");
//        user.setNumber("234546");
//        user.setSchool(school);
//        user.setTitle("教授");
//        user.setPhone("12345678978");
//        user.setType("teacher");
        return user;
    }

    @PutMapping("/me")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void modifyInfo(@RequestBody User user) {

    }
}
