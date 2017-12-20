package xmu.crms.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import xmu.crms.mapper.GradeMapper;

import java.math.BigInteger;

/**
 * @Author: zhangyuping
 * @Description:
 * @Data: 2017/12/19 18:21
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class GradeMapperTest {
    @Autowired
    private GradeMapper gm;

    @Test
    public void deleteStudentScoreGroupByTopicIdTest() {
        Boolean t1=gm.deleteStudentScoreGroupByTopicId(new BigInteger("100"));
        System.out.println(t1);
    }
}
