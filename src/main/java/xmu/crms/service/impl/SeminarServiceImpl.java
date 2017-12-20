package xmu.crms.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xmu.crms.entity.Course;
import xmu.crms.entity.Seminar;
import xmu.crms.mapper.SeminarMapper;
import xmu.crms.service.SeminarService;

import java.math.BigInteger;
import java.util.List;

/**
 * @Author: yexiaona
 * @Description:
 * @Data: 2017/12/19 21:49
 */
@Service
public class SeminarServiceImpl implements SeminarService {

    @Autowired
    private SeminarMapper seminarMapper;

    @Override
    public Boolean deleteSeminarByCourseId(BigInteger courseId) {
        Boolean isDeleted = true;
        List<Seminar> seminars = seminarMapper.listSeminarByCourseId(courseId);
        for (Seminar seminar : seminars
                ) {
            isDeleted = deleteSeminarBySeminarId(seminar.getId());
            //isDeleted = topicMapper.deleteTopicBySeminarId(seminar.getId());
            //isDeleted = seminarGroupMapper.deleteSeminarGroupBySeminarId(seminar.getId());
        }
        return isDeleted;
    }

    @Override
    public Boolean deleteSeminarBySeminarId(BigInteger seminarId) {
        return seminarMapper.deleteSeminarBySeminarId(seminarId);
    }

    @Override
    public Seminar getSeminarBySeminarId(BigInteger seminarId) {
        Seminar seminar = seminarMapper.getSeminarBySeminarId(seminarId);
        return seminar;
    }

    @Override
    public BigInteger insertSeminarByCourseId(BigInteger courseId, Seminar seminar) {
        Course course=new Course();
        course.setId(courseId);
        seminar.setCourse(course);

        seminarMapper.insertSeminarByCourseId(seminar);
        return seminar.getId();
    }

    @Override
    public List<Seminar> listSeminarByCourseId(BigInteger courseId) {
        List<Seminar> list = seminarMapper.listSeminarByCourseId(courseId);
        return list;
    }

    @Override
    public Boolean updateSeminarBySeminarId(BigInteger seminarId, Seminar seminar) {
        seminar.setId(seminarId);

        return true;
    }
}
