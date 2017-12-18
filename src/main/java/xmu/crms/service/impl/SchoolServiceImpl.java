package xmu.crms.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xmu.crms.entity.School;
import xmu.crms.mapper.SchoolMapper;
import xmu.crms.service.SchoolService;

import java.math.BigInteger;
import java.util.List;

/**
 *
 * @author badcode
 * @date 2017/12/18
 *
 */
@Service
public class SchoolServiceImpl implements SchoolService {

    @Autowired
    SchoolMapper schoolMapper;

    @Override
    public List<School> listSchoolByCity(String city) {
        return schoolMapper.listSchoolByCity(city);
    }

    @Override
    public School insertSchool(School school) {
        String id = String.valueOf(schoolMapper.insertSchool(school));
        School newSchool = new School();
        newSchool.setId(new BigInteger(id));
        return newSchool;
    }

    @Override
    public List<String> listProvince() {
        return null;
    }

    @Override
    public List<String> listCity(String province) {
        return null;
    }

    @Override
    public School getSchoolBySchoolId(BigInteger SchoolId) {
        return schoolMapper.getSchoolBySchoolId(SchoolId);
    }
}
