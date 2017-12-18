package xmu.crms.mapper;

import xmu.crms.entity.Seminar;

import java.math.BigInteger;

/**
 *
 * @author badcode
 * @date 2017/12/18
 *
 */
public interface SeminarMapper {

    Seminar getSeminarBySeminarId(BigInteger id);
}
