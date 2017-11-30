package xmu.crms.coursemanagesystem.entity;

import java.util.List;

/**
 * @author badcode
 * @date 2017/11/30
 */
public class Group {

    private Long id;
    private Student leader;
    private List<Student> members;
    private List<Topic> topics;
    private String report;
    private SeminarGrade grade;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Student getLeader() {
        return leader;
    }

    public void setLeader(Student leader) {
        this.leader = leader;
    }

    public List<Student> getMembers() {
        return members;
    }

    public void setMembers(List<Student> members) {
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
