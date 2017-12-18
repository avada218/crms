package xmu.crms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import xmu.crms.entity.School;
import xmu.crms.service.SchoolService;

import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

/**
 * @author badcode
 * @date 2017/12/01
 */
@RestController
public class SchoolController {

    @Autowired
    SchoolService schoolService;

    @GetMapping("/school")
    public List<School> getSchools(String city) {
        List<School> schoolList = schoolService.listSchoolByCity(city);
        System.out.println(city);
        return schoolList;
    }

    @PostMapping("/school")
    public School addSchool(@RequestBody School school, HttpServletResponse response) {
        System.out.println(school);
        School ret = schoolService.insertSchool(school);
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
