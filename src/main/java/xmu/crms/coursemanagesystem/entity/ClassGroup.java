package xmu.crms.coursemanagesystem.entity;

import java.util.List;

/**
 * @author badcode
 * @date 2017/11/30
 */
public class ClassGroup {

    private Long id;
    private Student leader;
    private List<Student> members;

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

    @Override
    public String toString() {
        return "ClassGroup{" +
                "id=" + id +
                ", leader=" + leader +
                ", members=" + members +
                '}';
    }
}
