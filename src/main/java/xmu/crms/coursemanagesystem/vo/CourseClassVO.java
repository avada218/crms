package xmu.crms.coursemanagesystem.vo;

import xmu.crms.coursemanagesystem.entity.CourseClass;

public class CourseClassVO {

    private Long id;
    private String name;
    private Integer numStudent;
    private String time;
    private String site;
    private String courseName;
    private String courseTeacher;

    public CourseClassVO() {}

    public CourseClassVO(CourseClass courseClass) {
        this.id = courseClass.getId();
        this.name = courseClass.getName();
        this.numStudent = courseClass.getNumStudent();
        this.time = courseClass.getTime();
        this.site = courseClass.getSite();
        this.courseName = courseClass.getCourse().getName();
        this.courseTeacher = courseClass.getCourse().getTeacher().getName();
    }

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

    public Integer getNumStudent() {
        return numStudent;
    }

    public void setNumStudent(Integer numStudent) {
        this.numStudent = numStudent;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseTeacher() {
        return courseTeacher;
    }

    public void setCourseTeacher(String courseTeacher) {
        this.courseTeacher = courseTeacher;
    }

    @Override
    public String toString() {
        return "CourseClassVO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", numStudent=" + numStudent +
                ", time='" + time + '\'' +
                ", site='" + site + '\'' +
                ", courseName='" + courseName + '\'' +
                ", courseTeacher='" + courseTeacher + '\'' +
                '}';
    }
}
