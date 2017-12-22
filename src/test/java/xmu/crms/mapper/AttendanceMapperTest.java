package xmu.crms.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import xmu.crms.entity.Attendance;
import xmu.crms.entity.ClassInfo;
import xmu.crms.entity.Seminar;
import xmu.crms.entity.User;

import java.math.BigInteger;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AttendanceMapperTest {

    @Autowired
    private AttendanceMapper attendanceMapper;

    @Test
    public void testInsertAttendanceById() {
        Attendance attendance = new Attendance();
        User student = new User();
        student.setId(new BigInteger("1"));
        Seminar seminar = new Seminar();
        seminar.setId(new BigInteger("1"));
        ClassInfo classInfo = new ClassInfo();
        classInfo.setId(BigInteger.valueOf(2));
        attendance.setAttendanceStatus(1);
        attendance.setSeminar(seminar);
        attendance.setStudent(student);
        attendance.setClassInfo(classInfo);
        attendanceMapper.insertAttendanceById(attendance);
        System.out.println(attendance.getId());
    }
}
