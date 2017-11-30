package xmu.crms.coursemanagesystem.vo;

import java.util.List;

/**
 * @Author: guiyu
 * @Description:
 * @Data: Created in 2017/11/29
 */
public class GetGroupVo {
    private List<PresentationGradeVo> presentationGradeVo;
    private Integer reportGrade;

    public List<PresentationGradeVo> getPresentationGradeVo() {
        return presentationGradeVo;
    }

    public void setPresentationGradeVo(List<PresentationGradeVo> presentationGradeVo) {
        this.presentationGradeVo = presentationGradeVo;
    }

    public Integer getReportGrade() {
        return reportGrade;
    }

    public void setReportGrade(Integer reportGrade) {
        this.reportGrade = reportGrade;
    }

    @Override
    public String toString() {
        return "GetGroupVo{" +
                "presentationGradeVo=" + presentationGradeVo +
                ", reportGrade=" + reportGrade +
                '}';
    }
}
