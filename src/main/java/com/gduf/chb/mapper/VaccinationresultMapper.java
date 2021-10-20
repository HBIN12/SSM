package com.gduf.chb.mapper;

import com.gduf.chb.bean.Vaccinationresult;
import com.gduf.chb.bean.VaccinationresultExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VaccinationresultMapper {
    int countByExample(VaccinationresultExample example);

    int deleteByExample(VaccinationresultExample example);

    int deleteByPrimaryKey(String idcard);

    int insert(Vaccinationresult record);

    int insertSelective(Vaccinationresult record);

    List<Vaccinationresult> selectByExample(VaccinationresultExample example);

    Vaccinationresult selectByPrimaryKey(String idcard);

    int updateByExampleSelective(@Param("record") Vaccinationresult record, @Param("example") VaccinationresultExample example);

    int updateByExample(@Param("record") Vaccinationresult record, @Param("example") VaccinationresultExample example);

    int updateByPrimaryKeySelective(Vaccinationresult record);

    int updateByPrimaryKey(Vaccinationresult record);
}