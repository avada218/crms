package xmu.crms.service.impl;

import org.springframework.stereotype.Service;
import xmu.crms.entity.ClassInfo;
import xmu.crms.entity.Location;
import xmu.crms.exception.CourseNotFoundException;
import xmu.crms.exception.InvalidOperationException;
import xmu.crms.exception.SeminarNotFoundException;
import xmu.crms.exception.UserNotFoundException;
import xmu.crms.service.ClassService;

import java.math.BigInteger;
import java.util.List;

/**
 * @Author: yexiaona
 * @Description:
 * @Data: 2017/12/22 21:13
 */
@Service
public class ClassServiceImpl implements ClassService {
    @Override
    public void deleteClassSelectionByClassId(BigInteger classId) {

    }

    @Override
    public List<ClassInfo> listClassByName(String courseName, String teacherName) throws UserNotFoundException, CourseNotFoundException {
        return null;
    }

    @Override
    public List<ClassInfo> listClassByCourseId(BigInteger courseId) throws CourseNotFoundException {
        return null;
    }

    @Override
    public ClassInfo getClassByClassId(BigInteger classId) throws ClassNotFoundException {
        return null;
    }

    @Override
    public void updateClassByClassId(BigInteger classId, ClassInfo newClass) throws ClassNotFoundException {

    }

    @Override
    public void deleteClassByClassId(BigInteger classId) throws ClassNotFoundException {

    }

    @Override
    public BigInteger insertCourseSelectionById(BigInteger userId, BigInteger classId) throws UserNotFoundException, ClassNotFoundException {
        return null;
    }

    @Override
    public void deleteCourseSelectionById(BigInteger userId, BigInteger classId) throws UserNotFoundException, ClassNotFoundException {

    }


    @Override
    public BigInteger insertClassById(BigInteger userId, BigInteger courseId, ClassInfo classInfo) throws UserNotFoundException, CourseNotFoundException {
        return null;
    }

    @Override
    public void deleteClassByCourseId(BigInteger courseId) throws CourseNotFoundException {
    }

    @Override
    public void deleteScoreRuleById(BigInteger classId) throws ClassNotFoundException {
    }

    @Override
    public ClassInfo getScoreRule(BigInteger classId) throws ClassNotFoundException {
        return null;
    }

    @Override
    public BigInteger insertScoreRule(BigInteger classId, ClassInfo proportions) throws InvalidOperationException, ClassNotFoundException {
        return null;
    }

    @Override
    public void updateScoreRule(BigInteger classId, ClassInfo proportions) throws InvalidOperationException, ClassNotFoundException {
    }

    @Override
    public Location getCallStatusById(BigInteger classId, BigInteger seminarId) throws SeminarNotFoundException {
        return null;
    }

    @Override
    public BigInteger CallInRollById(Location location) throws SeminarNotFoundException, ClassNotFoundException {
        return null;
    }
}
