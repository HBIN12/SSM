package com.gduf.chb.mapper;

import com.gduf.chb.bean.Riskregion;
import com.gduf.chb.bean.RiskregionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RiskregionMapper {
    int countByExample(RiskregionExample example);

    int deleteByExample(RiskregionExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Riskregion record);

    int insertSelective(Riskregion record);

    List<Riskregion> selectByExample(RiskregionExample example);

    Riskregion selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Riskregion record, @Param("example") RiskregionExample example);

    int updateByExample(@Param("record") Riskregion record, @Param("example") RiskregionExample example);

    int updateByPrimaryKeySelective(Riskregion record);

    int updateByPrimaryKey(Riskregion record);
}