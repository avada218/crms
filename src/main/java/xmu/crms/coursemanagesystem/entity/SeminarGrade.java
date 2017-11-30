package xmu.crms.coursemanagesystem.entity;

import java.util.List;

/**
 * @author badcode
 * @date 2017/11/30
 */
public class SeminarGrade {

    private List presentationGrade;
    private Integer reportGrade;
    private Integer grade;

    public List getPresentationGrade() {
        return presentationGrade;
    }

    public void setPresentationGrade(List presentationGrade) {
        this.presentationGrade = presentationGrade;
    }

    public Integer getReportGrade() {
        return reportGrade;
    }

    public void setReportGrade(Integer reportGrade) {
        this.reportGrade = reportGrade;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "SeminarGrade{" +
                "presentationGrade=" + presentationGrade +
                ", reportGrade=" + reportGrade +
                ", grade=" + grade +
                '}';
    }
}
