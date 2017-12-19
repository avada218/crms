package xmu.crms.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import xmu.crms.entity.School;

import java.math.BigInteger;
import java.util.List;

/**
 *
 * @author badcode
 * @date 2017/12/18
 *
 */
@Mapper
@Component
public interface SchoolMapper {

    /**
     * 根据城市名称查询学校
     * @param city 城市名称
     * @return List<School> 满足条件的学校列表
     */
    List<School> listSchoolByCity(String city);

    /**
     * 新建学校
     * @param school 学校信息
     * @return Boolean 是否新建成功
     */
    int insertSchool(School school);

    /**
     * 根据学校ID获取学校信息
     * @param id 学校ID
     * @return School
     */
    School getSchoolBySchoolId(School school);
}
