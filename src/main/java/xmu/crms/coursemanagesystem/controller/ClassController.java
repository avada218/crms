package xmu.crms.coursemanagesystem.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import xmu.crms.coursemanagesystem.vo.GetClassVO;


import java.util.ArrayList;
import java.util.List;

/**
 * @author badcode
 * @date 2017/11/29
 */
@RestController
public class ClassController {

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
}
