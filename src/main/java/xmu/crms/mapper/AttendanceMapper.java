package xmu.crms.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;
import xmu.crms.entity.Attendance;

/**
 *
 * @author badcode
 * @date 2017/12/22
 *
 */
@Mapper
@Component
public interface AttendanceMapper {

    /**
     *
     * 插入签到信息
     *
     * @param attendance 签到信息
     * @return Integer 影响行数
     *
     */
    Integer insertAttendanceById(Attendance attendance);
}
