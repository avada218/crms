package xmu.crms.coursemanagesystem.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import xmu.crms.coursemanagesystem.vo.GetGroupVo;
import xmu.crms.coursemanagesystem.vo.PresentationGradeVo;

import java.util.ArrayList;
import java.util.List;


@RestController
/**
 * @author badcode
 * @date 2017/11/30
 */
public class GroupController {
    @GetMapping("/group/{groupId}/grade")
    public GetGroupVo getGroupVos(){
        List<PresentationGradeVo> presentationGradeVos = new ArrayList<>();
        PresentationGradeVo presentationGradeVo1 = new PresentationGradeVo();
        presentationGradeVo1.setTopicId(257L);
        presentationGradeVo1.setGrade(4);
        PresentationGradeVo presentationGradeVo2 = new PresentationGradeVo();
        presentationGradeVo2.setTopicId(285L);
        presentationGradeVo2.setGrade(5);
        presentationGradeVos.add(presentationGradeVo1);
        presentationGradeVos.add(presentationGradeVo2);
        GetGroupVo getGroupVo = new GetGroupVo();
        getGroupVo.setPresentationGradeVo(presentationGradeVos);
        return getGroupVo;
    }
}
