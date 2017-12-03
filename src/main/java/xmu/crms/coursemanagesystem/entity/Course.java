package xmu.crms.coursemanagesystem.entity;

import java.util.Date;

/**
 * @author badcode
 * @date 2017/11/29
 */
public class Course {

    private Long id;
    private User teacher;
    private String name;
    private Integer numClass;
    private Integer numStudent;
    private String description;
    private Proportions proportions;
    private Date startTime;
    private Date endTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getTeacher() {
        return teacher;
    }

    public void setTeacher(User teacher) {
        this.teacher = teacher;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Proportions getProportions() {
        return proportions;
    }

    public void setProportions(Proportions proportions) {
        this.proportions = proportions;
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
        return "Course{" +
                "id=" + id +
                ", teacher=" + teacher +
                ", name='" + name + '\'' +
                ", numClass=" + numClass +
                ", numStudent=" + numStudent +
                ", description='" + description + '\'' +
                ", proportions=" + proportions +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                '}';
    }
}
