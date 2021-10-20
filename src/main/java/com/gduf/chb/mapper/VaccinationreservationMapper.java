package com.gduf.chb.mapper;

import com.gduf.chb.bean.Vaccinationreservation;
import com.gduf.chb.bean.VaccinationreservationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VaccinationreservationMapper {
    int countByExample(VaccinationreservationExample example);

    int deleteByExample(VaccinationreservationExample example);

    int deleteByPrimaryKey(String idcard);

    int insert(Vaccinationreservation record);

    int insertSelective(Vaccinationreservation record);

    List<Vaccinationreservation> selectByExample(VaccinationreservationExample example);

    Vaccinationreservation selectByPrimaryKey(String idcard);

    int updateByExampleSelective(@Param("record") Vaccinationreservation record, @Param("example") VaccinationreservationExample example);

    int updateByExample(@Param("record") Vaccinationreservation record, @Param("example") VaccinationreservationExample example);

    int updateByPrimaryKeySelective(Vaccinationreservation record);

    int updateByPrimaryKey(Vaccinationreservation record);
}