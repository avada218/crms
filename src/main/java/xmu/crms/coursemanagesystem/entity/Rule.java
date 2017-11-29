package xmu.crms.coursemanagesystem.entity;

/**
 * @author badcode
 * @date 2017/11/29
 */
public class Rule {

    private Long id;
    private Integer percent3;
    private Integer percent4;
    private Integer percent5;
    private Integer report;
    private Integer presentation;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getPercent3() {
        return percent3;
    }

    public void setPercent3(Integer percent3) {
        this.percent3 = percent3;
    }

    public Integer getPercent4() {
        return percent4;
    }

    public void setPercent4(Integer percent4) {
        this.percent4 = percent4;
    }

    public Integer getPercent5() {
        return percent5;
    }

    public void setPercent5(Integer percent5) {
        this.percent5 = percent5;
    }

    public Integer getReport() {
        return report;
    }

    public void setReport(Integer report) {
        this.report = report;
    }

    public Integer getPresentation() {
        return presentation;
    }

    public void setPresentation(Integer presentation) {
        this.presentation = presentation;
    }
}
