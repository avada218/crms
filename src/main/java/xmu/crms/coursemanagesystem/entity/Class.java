package xmu.crms.coursemanagesystem.entity;

import java.util.List;

/**
 * @author badcode
 * @date 2017/11/30
 */
public class Class {

    private Long id;
    private String name;
    private Integer numStudent;
    private List<ClassTime> timeSite;
    private Boolean calling;
    private String roster;
    private Proportions proportions;

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

    public List<ClassTime> getTimeSite() {
        return timeSite;
    }

    public void setTimeSite(List<ClassTime> timeSite) {
        this.timeSite = timeSite;
    }

    public Boolean getCalling() {
        return calling;
    }

    public void setCalling(Boolean calling) {
        this.calling = calling;
    }

    public String getRoster() {
        return roster;
    }

    public void setRoster(String roster) {
        this.roster = roster;
    }

    public Proportions getProportions() {
        return proportions;
    }

    public void setProportions(Proportions proportions) {
        this.proportions = proportions;
    }

    @Override
    public String toString() {
        return "Class{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", numStudent=" + numStudent +
                ", timeSite=" + timeSite +
                ", calling=" + calling +
                ", roster='" + roster + '\'' +
                ", proportions=" + proportions +
                '}';
    }
}
