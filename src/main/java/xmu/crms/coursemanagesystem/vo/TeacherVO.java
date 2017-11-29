package xmu.crms.coursemanagesystem.vo;

import xmu.crms.coursemanagesystem.entity.School;
import xmu.crms.coursemanagesystem.entity.Teacher;

/**
 * @author badcode
 * @date 2017/11/29
 */
public class TeacherVO {

    private Long id;
    private String name;
    private String number;
    private String phone;
    private String email;
    private String gender;
    private School school;
    private String title;
    private String avatar;
    private String type;

    public TeacherVO(Teacher teacher) {
        setId(teacher.getId());
        setAvatar(teacher.getAvatar());
        setEmail(teacher.getEmail());
        setGender(teacher.getGender());
        setName(teacher.getName());
        setNumber(teacher.getNumber());
        setSchool(teacher.getSchool());
        setTitle(teacher.getTitle());
        setPhone(teacher.getPhone());
        setType("teacher");
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

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "TeacherVO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", number='" + number + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", gender='" + gender + '\'' +
                ", school=" + school +
                ", title='" + title + '\'' +
                ", avatar='" + avatar + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
