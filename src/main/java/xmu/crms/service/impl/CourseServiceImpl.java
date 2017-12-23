package xmu.crms.service.impl;

import org.springframework.stereotype.Service;
import xmu.crms.entity.ClassInfo;
import xmu.crms.entity.Course;
import xmu.crms.exception.CourseNotFoundException;
import xmu.crms.service.CourseService;

import java.math.BigInteger;
import java.util.List;

/**
 * @Author: yexiaona
 * @Description:
 * @Data: 2017/12/22 15:30
 */
@Service
public class CourseServiceImpl implements CourseService{
    @Override
    public List<Course> listCourseByUserId(BigInteger userId) throws IllegalArgumentException, CourseNotFoundException {
        return null;
    }

    @Override
    public BigInteger insertCourseByUserId(BigInteger userId, Course course) throws IllegalArgumentException {
        return null;
    }

    @Override
    public Course getCourseByCourseId(BigInteger courseId) throws IllegalArgumentException, CourseNotFoundException {
        return null;
    }

    @Override
    public void updateCourseByCourseId(BigInteger courseId, Course course) {

    }

    @Override
    public void deleteCourseByCourseId(BigInteger courseId) throws IllegalArgumentException {

    }

    @Override
    public List<Course> listCourseByCourseName(String courseName) {
        return null;
    }

    @Override
    public List<ClassInfo> listClassByCourseName(String courseName) {
        return null;
    }

    @Override
    public List<ClassInfo> listClassByTeacherName(String teacherName) {
        return null;
    }

    @Override
    public List<ClassInfo> listClassByUserId(BigInteger userId) throws IllegalArgumentException, ClassNotFoundException {
        return null;
    }
}
