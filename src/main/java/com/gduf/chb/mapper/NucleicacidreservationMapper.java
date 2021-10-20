package com.gduf.chb.mapper;

import com.gduf.chb.bean.Nucleicacidreservation;
import com.gduf.chb.bean.NucleicacidreservationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NucleicacidreservationMapper {
    int countByExample(NucleicacidreservationExample example);

    int deleteByExample(NucleicacidreservationExample example);

    int deleteByPrimaryKey(String idcard);

    int insert(Nucleicacidreservation record);

    int insertSelective(Nucleicacidreservation record);

    List<Nucleicacidreservation> selectByExample(NucleicacidreservationExample example);

    Nucleicacidreservation selectByPrimaryKey(String idcard);

    int updateByExampleSelective(@Param("record") Nucleicacidreservation record, @Param("example") NucleicacidreservationExample example);

    int updateByExample(@Param("record") Nucleicacidreservation record, @Param("example") NucleicacidreservationExample example);

    int updateByPrimaryKeySelective(Nucleicacidreservation record);

    int updateByPrimaryKey(Nucleicacidreservation record);
}