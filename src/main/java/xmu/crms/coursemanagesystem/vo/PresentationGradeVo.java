package xmu.crms.coursemanagesystem.vo;

/**
 * @Author: guiyu
 * @Description:
 * @Data: Created in 2017/11/30
 */
public class PresentationGradeVo {
    private Long TopicId;
    private Integer grade;

    public Long getTopicId() {
        return TopicId;
    }

    public void setTopicId(Long topicId) {
        TopicId = topicId;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "PresentationGradeVo{" +
                "TopicId=" + TopicId +
                ", grade=" + grade +
                '}';
    }
}
