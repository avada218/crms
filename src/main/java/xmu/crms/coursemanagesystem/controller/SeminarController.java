package xmu.crms.coursemanagesystem.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import xmu.crms.coursemanagesystem.vo.GetSeminarVO;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 * @author badcode
 * @date 2017/11/29
 */
@RestController
public class SeminarController {

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
}
