package xmu.crms.coursemanagesystem.entity;

/**
 * @author badcode
 * @date 2017/11/30
 */
public class Proportions {

    private Integer a;
    private Integer b;
    private Integer c;
    private Integer report;
    private Integer presentation;

    public Integer getA() {
        return a;
    }

    public void setA(Integer a) {
        this.a = a;
    }

    public Integer getB() {
        return b;
    }

    public void setB(Integer b) {
        this.b = b;
    }

    public Integer getC() {
        return c;
    }

    public void setC(Integer c) {
        this.c = c;
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

    @Override
    public String toString() {
        return "Proportions{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                ", report=" + report +
                ", presentation=" + presentation +
                '}';
    }
}
