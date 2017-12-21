package xmu.crms.service;

import xmu.crms.entity.SeminarGroup;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Yexiaona
 * @version 2.00
 *
 */
public interface GradeService {

	/**
	 * 按topicId删除学生打分表.
	 * @author zhouzhongjun
	 * @param topicId 话题Id
	 *  @return true删除成功  false删除失败
	 */
	Boolean deleteStudentScoreGroupByTopicId(BigInteger topicId);
	/**
	 * 获取某学生一堂讨论课信息.
	 * <p>获取某学生一堂讨论课的详细信息（包括成绩）<br>
	 * @author qinlingyun
	 * @param userId 学生id
	 * @param seminarGroupId 讨论课小组id
	 * @return list 讨论课分数列表
	 */
	SeminarGroup getSeminarGroupBySeminarGroupId(BigInteger userId, BigInteger seminarGroupId);

	/**
	 * 获取某学生所有讨论课的所有成绩
	 * <p>获取某学生所有讨论课的详细信息（包括成绩）<br>
	 * @author qinlingyun
	 * @param userId
	 * @return list 学生历史讨论课小组列表（包含成绩）
	 * @see SeminarGroupService#listSeminarGroupIdByStudentId(BigInteger)
	 * @see GradeService#getSeminarGroupBySeminarGroupId(BigInteger, BigInteger)
	 */
	List<SeminarGroup> listSeminarGradeByUserId(BigInteger userId);

	/**
	 * 提交对其他小组的打分.
	 *
	 * @author Huhui
	 * @param userId 用户id
	 * @param seminarId 讨论课Id
	 * @param groupId 小组Id
	 * @param grade 分数
	 * @param topicId 话题id
	 * @return true 提交成功 false 提交失败
	 */
	Boolean insertGroupGradeByUserId(BigInteger topicId,BigInteger userId,BigInteger seminarId,BigInteger groupId,BigInteger grade) ;

	/**
	 * 按ID设置小组报告分.
	 *
	 * @author Huhui
	 * @param seminar_group_id 讨论课组id
	 * @param grade 分数
	 * @return Boolean true 操作成功 false 操作失败
	 */
	Boolean updateGroupByGroupId(BigInteger seminar_group_id, BigInteger grade) ;
}
