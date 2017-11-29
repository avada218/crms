package xmu.crms.coursemanagesystem.vo;

import xmu.crms.coursemanagesystem.entity.Rule;

import java.util.List;

/**
 * @Author: guiyu
 * @Description:
 * @Data: Created in 2017/11/29
 */
public class GetClassInfoVO {

    private Long id;
    private String name;
    private List<Time> time;
    private Boolean calling;
    private String roster;
    private Rule properties;

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

    public List<Time> getTime() {
        return time;
    }

    public void setTime(List<Time> time) {
        this.time = time;
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

    public Rule getProperties() {
        return properties;
    }

    public void setProperties(Rule properties) {
        this.properties = properties;
    }

    @Override
    public String toString() {
        return "GetClassInfoVO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", time=" + time +
                ", calling=" + calling +
                ", roster='" + roster + '\'' +
                ", properties=" + properties +
                '}';
    }
}
