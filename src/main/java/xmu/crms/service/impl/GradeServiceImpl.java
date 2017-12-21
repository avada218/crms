package xmu.crms.service.impl;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xmu.crms.entity.SeminarGroup;
import xmu.crms.mapper.GradeMapper;
import xmu.crms.service.GradeService;

import java.math.BigInteger;
import java.util.List;


/**
 * @Author: zhangyuping
 * @Description:
 * @Data: 2017/12/20 17:43
 */
@Service
public class GradeServiceImpl implements GradeService{
    @Autowired
    GradeMapper gradeMapper;

    @Override
    public Boolean deleteStudentScoreGroupByTopicId(BigInteger topicId){

    }

}
