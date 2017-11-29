package xmu.crms.coursemanagesystem.vo;

import java.util.Date;

/**
 * @author badcode
 * @date 2017/11/29
 */
public class GetCourseVO {

    private Long id;
    private String name;
    private Integer numClass;
    private Integer numStudent;
    private Date startTime;
    private Date endTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNumClass() {
        return numClass;
    }

    public void setNumClass(Integer numClass) {
        this.numClass = numClass;
    }

    public Integer getNumStudent() {
        return numStudent;
    }

    public void setNumStudent(Integer numStudent) {
        this.numStudent = numStudent;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    @Override
    public String toString() {
        return "GetCourseVO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", numClass=" + numClass +
                ", numStudent=" + numStudent +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                '}';
    }
}
