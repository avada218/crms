package xmu.crms.coursemanagesystem.vo;

import xmu.crms.coursemanagesystem.entity.Course;

/**
 * @author badcode
 * @date 2017/11/29
 */
public class AddCourseVO {

    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "AddCourseVO{" +
                "id=" + id +
                '}';
    }
}
