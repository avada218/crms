package xmu.crms.coursemanagesystem.controller;

import org.springframework.web.bind.annotation.*;
import xmu.crms.coursemanagesystem.entity.School;

import javax.servlet.http.HttpServletResponse;
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

    @PostMapping("/school")
    public School addSchool(@RequestBody School newSchool, HttpServletResponse response) {
        School ret = new School();
        ret.setId(38L);
        response.setStatus(201);
        return ret;
    }

    @GetMapping("/school/province")
    public List<String> getProvinceList() {
        List<String> provinceList = new ArrayList<>();
        provinceList.add("北京");
        provinceList.add("天津");
        return provinceList;
    }

    @GetMapping("/school/city")
    public List<String> getCityList() {
        List<String> cityList = new ArrayList<>();
        cityList.add("北京");
        cityList.add("天津");
        return cityList;
    }
}
