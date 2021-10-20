package com.gduf.chb.mapper;

import com.gduf.chb.bean.Nucleicacidresult;
import com.gduf.chb.bean.NucleicacidresultExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NucleicacidresultMapper {
    int countByExample(NucleicacidresultExample example);

    int deleteByExample(NucleicacidresultExample example);

    int deleteByPrimaryKey(String idcard);

    int insert(Nucleicacidresult record);

    int insertSelective(Nucleicacidresult record);

    List<Nucleicacidresult> selectByExample(NucleicacidresultExample example);

    Nucleicacidresult selectByPrimaryKey(String idcard);

    int updateByExampleSelective(@Param("record") Nucleicacidresult record, @Param("example") NucleicacidresultExample example);

    int updateByExample(@Param("record") Nucleicacidresult record, @Param("example") NucleicacidresultExample example);

    int updateByPrimaryKeySelective(Nucleicacidresult record);

    int updateByPrimaryKey(Nucleicacidresult record);
}