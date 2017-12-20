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
    public void mytest() {
        //Boolean t1=gm.deleteStudentScoreGroupByTopicId(new BigInteger("100"));
        //System.out.println(t1);
       // Boolean t2= gm.insertGroupGradeByUserId(new BigInteger("1000"),new BigInteger("2"),new BigInteger("25"),new BigInteger("5"));
       // System.out.println(t2);
    }
}
