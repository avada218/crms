package xmu.crms.coursemanagesystem.entity;

import java.util.List;

/**
 * @author badcode
 * @date 2017/11/30
 */
public class Group {

    private Long id;
    private User leader;
    private List<User> members;
    private List<Topic> topics;
    private String report;
    private SeminarGrade grade;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getLeader() {
        return leader;
    }

    public void setLeader(User leader) {
        this.leader = leader;
    }

    public List<User> getMembers() {
        return members;
    }

    public void setMembers(List<User> members) {
        this.members = members;
    }

    public List<Topic> getTopics() {
        return topics;
    }

    public void setTopics(List<Topic> topics) {
        this.topics = topics;
    }

    public String getReport() {
        return report;
    }

    public void setReport(String report) {
        this.report = report;
    }

    public SeminarGrade getGrade() {
        return grade;
    }

    public void setGrade(SeminarGrade grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Group{" +
                "id=" + id +
                ", leader=" + leader +
                ", members=" + members +
                ", topics=" + topics +
                ", report='" + report + '\'' +
                ", grade=" + grade +
                '}';
    }
}
