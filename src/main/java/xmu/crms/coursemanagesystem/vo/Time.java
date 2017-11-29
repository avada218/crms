package xmu.crms.coursemanagesystem.vo;

import java.util.List;

/**
 * @Author: guiyu
 * @Description:
 * @Data: Created in 2017/11/29
 */
public class Time {

    private Integer week;
    private Integer day;
    private List<Integer> lessons;
    private String site;

    public Integer getWeek() {
        return week;
    }

    public void setWeek(Integer week) {
        this.week = week;
    }

    public Integer getDay() {
        return day;
    }

    public void setDay(Integer day) {
        this.day = day;
    }

    public List<Integer> getLessons() {
        return lessons;
    }

    public void setLessons(List<Integer> lessons) {
        this.lessons = lessons;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    @Override
    public String toString() {
        return "Time{" +
                "week=" + week +
                ", day=" + day +
                ", lessons=" + lessons +
                ", site='" + site + '\'' +
                '}';
    }
}
