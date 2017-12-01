package xmu.crms.coursemanagesystem.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import xmu.crms.coursemanagesystem.entity.School;

import java.util.ArrayList;
import java.util.List;

/**
 * @author badcode
 * @date 2017/12/01
 */
@RestController
public class SchoolController {

    @GetMapping("/school")
    public List<School> getSchools() {
        List<School> schools = new ArrayList<>();
        School school1 = new School();
        school1.setId(32L);
        school1.setName("厦门大学");
        school1.setProvince("福建");
        school1.setCity("厦门");
        schools.add(school1);
        School school2 = new School();
        school2.setId(37L);
        school2.setName("厦门软件学院");
        school2.setProvince("福建");
        school2.setCity("厦门");
        schools.add(school2);
        return schools;
    }
}
