package xmu.crms.coursemanagesystem.controller;

import org.springframework.web.bind.annotation.*;
import xmu.crms.coursemanagesystem.entity.Class;
import xmu.crms.coursemanagesystem.entity.Student;
import xmu.crms.coursemanagesystem.vo.GetClassInfoVO;
import xmu.crms.coursemanagesystem.vo.Response;


import java.util.ArrayList;
import java.util.List;

/**
 * @author badcode
 * @date 2017/11/29
 */
@RestController
public class ClassController {

    //TODO
    @GetMapping("/class")
    public List<Class> getClasses() {
        return null;
    }

    @GetMapping("/class/{classId}")
    public GetClassInfoVO getClassInfo(@PathVariable("classId") int id) {
        return null;
    }

    @PutMapping("/class/{classId}")
    public Response modify(@PathVariable("classId") int classId, @RequestBody Class oldClass) {
        return new Response(204);
    }

    @DeleteMapping("/class/{classId}")
    public Response delete(@PathVariable("classId") int classId) {
        return new Response(204);
    }

    @GetMapping("/class/{classId}")
    public List<Student> getClassStudent(@PathVariable int classId) {
        List<Student> students = new ArrayList<Student>();
        return students;
    }


}
