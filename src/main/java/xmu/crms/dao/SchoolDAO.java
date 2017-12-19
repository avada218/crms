package xmu.crms.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import xmu.crms.entity.School;
import xmu.crms.mapper.SchoolMapper;

import java.util.List;

/**
 *
 * @author badcode
 * @date 2017/12/19
 *
 */
@Component
public class SchoolDAO {

    @Autowired
    private SchoolMapper schoolMapper;

    public List<School> listSchoolByCity(String city) {
        return schoolMapper.listSchoolByCity(city);
    }
}
