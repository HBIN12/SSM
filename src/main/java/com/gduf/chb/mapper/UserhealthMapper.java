package com.gduf.chb.mapper;

import com.gduf.chb.bean.Userhealth;
import com.gduf.chb.bean.UserhealthExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserhealthMapper {
    int countByExample(UserhealthExample example);

    int deleteByExample(UserhealthExample example);

    int deleteByPrimaryKey(String idcard);

    int insert(Userhealth record);

    int insertSelective(Userhealth record);

    List<Userhealth> selectByExample(UserhealthExample example);

    Userhealth selectByPrimaryKey(String idcard);

    int updateByExampleSelective(@Param("record") Userhealth record, @Param("example") UserhealthExample example);

    int updateByExample(@Param("record") Userhealth record, @Param("example") UserhealthExample example);

    int updateByPrimaryKeySelective(Userhealth record);

    int updateByPrimaryKey(Userhealth record);
}