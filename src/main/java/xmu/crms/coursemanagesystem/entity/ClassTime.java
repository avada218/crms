package xmu.crms.coursemanagesystem.entity;

import java.util.List;

/**
 * @author badcode
 * @date 2017/11/30
 */
public class ClassTime {

    private Integer week;
    private Integer day;
    private List<Integer> lesson;
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

    public List<Integer> getLesson() {
        return lesson;
    }

    public void setLesson(List<Integer> lesson) {
        this.lesson = lesson;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    @Override
    public String toString() {
        return "ClassTime{" +
                "week=" + week +
                ", day=" + day +
                ", lesson=" + lesson +
                ", site='" + site + '\'' +
                '}';
    }
}
