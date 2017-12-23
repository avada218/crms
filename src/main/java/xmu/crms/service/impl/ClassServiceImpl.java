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
    public Boolean deleteClassSelectionByClassId(BigInteger classId) {
        return null;
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
    public Boolean updateClassByClassId(BigInteger classId, ClassInfo newClass) throws ClassNotFoundException {
        return null;
    }

    @Override
    public Boolean deleteClassByClassId(BigInteger classId) throws ClassNotFoundException {
        return null;
    }

    @Override
    public String insertCourseSelectionById(BigInteger userId, BigInteger classId) throws UserNotFoundException, ClassNotFoundException {
        return null;
    }

    @Override
    public Boolean deleteCourseSelectionById(BigInteger userId, BigInteger classId) throws UserNotFoundException, ClassNotFoundException {
        return null;
    }

    @Override
    public Location getCallStatusById(BigInteger seminarId) throws SeminarNotFoundException {
        return null;
    }

    @Override
    public BigInteger insertClassById(BigInteger userId, BigInteger courseId, ClassInfo classInfo) throws UserNotFoundException, CourseNotFoundException {
        return null;
    }

    @Override
    public Boolean deleteClassByCourseId(BigInteger courseId) throws CourseNotFoundException {
        return null;
    }

    @Override
    public Boolean deleteScoreRuleById(BigInteger classId) throws ClassNotFoundException {
        return null;
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
    public Boolean updateScoreRule(BigInteger classId, ClassInfo proportions) throws InvalidOperationException, ClassNotFoundException {
        return null;
    }
}
