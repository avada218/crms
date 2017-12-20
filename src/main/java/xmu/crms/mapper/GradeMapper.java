package xmu.crms.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
import xmu.crms.entity.SeminarGroup;
import xmu.crms.entity.StudentScoreGroup;

import java.math.BigInteger;
import java.util.List;

/**
 * @Author: zhangyuping
 * @Description:
 * @Data: 2017/12/19 17:09
 */
@Mapper
@Component
public interface GradeMapper {
    /**
     * 按topicId删除学生打分表.
     * @param topicId
     * @return true删除成功 false删除失败
     */
    Boolean deleteStudentScoreGroupByTopicId(BigInteger topicId);

    /**
     * 提交对其他小组的打分.
     * @param userId
     * @param seminarId
     * @param groupId
     * @param grade
     * @return true 提交成功 false 提交失败
     */
    Boolean insertGroupGradeByUserId(@Param("userId") BigInteger userId, @Param("seminarId") BigInteger seminarId, @Param("groupId") BigInteger groupId, @Param("grade") BigInteger grade);

    /**
     * 获取某学生一堂讨论课信息.
     * <p>获取某学生一堂讨论课的详细信息（包括成绩）<br>
     * @param seminarGroup
     * @return SeminarGroup
     */
    SeminarGroup getSeminarGroupBySeminarGroupId(SeminarGroup seminarGroup);

    /**
     * 获取某学生的讨论课.
     * @param userId
     * @return list 讨论课列表
     */
    List<SeminarGroup> listSeminarGroupIdByUserId(BigInteger userId);

    /**
     * 按ID设置小组报告分.
     * @param seminarGroup
     * @return true 操作成功 false 操作失败
     */
    Boolean updateGroupByGroupId(SeminarGroup seminarGroup);

}
