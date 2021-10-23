package com.gduf.chb.mapper;

import com.gduf.chb.bean.Vaccineandnucleicacid;
import com.gduf.chb.bean.VaccineandnucleicacidExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VaccineandnucleicacidMapper {
    int countByExample(VaccineandnucleicacidExample example);

    int deleteByExample(VaccineandnucleicacidExample example);

    int deleteByPrimaryKey(Integer hospitalnumber);

    int insert(Vaccineandnucleicacid record);

    int insertSelective(Vaccineandnucleicacid record);

    List<Vaccineandnucleicacid> selectByExample(VaccineandnucleicacidExample example);

    Vaccineandnucleicacid selectByPrimaryKey(Integer hospitalnumber);

    int updateByExampleSelective(@Param("record") Vaccineandnucleicacid record, @Param("example") VaccineandnucleicacidExample example);

    int updateByExample(@Param("record") Vaccineandnucleicacid record, @Param("example") VaccineandnucleicacidExample example);

    int updateByPrimaryKeySelective(Vaccineandnucleicacid record);

    int updateByPrimaryKey(Vaccineandnucleicacid record);
}