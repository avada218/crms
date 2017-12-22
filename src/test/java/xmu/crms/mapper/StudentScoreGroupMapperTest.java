package xmu.crms.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import xmu.crms.entity.StudentScoreGroup;

import java.math.BigInteger;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StudentScoreGroupMapperTest {

    @Autowired
    private StudentScoreGroupMapper studentScoreGroupMapper;

    @Test
    public void testGetById() {
        StudentScoreGroup studentScoreGroup = new StudentScoreGroup();
        studentScoreGroup.setId(BigInteger.valueOf(1L));
        System.out.println(studentScoreGroupMapper.getById(studentScoreGroup));
    }
}
