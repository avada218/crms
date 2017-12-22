package xmu.crms.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import xmu.crms.entity.StudentScoreGroup;

@Mapper
@Component
public interface StudentScoreGroupMapper {

    StudentScoreGroup getById(StudentScoreGroup studentScoreGroup);
}

