package com.sora.demo.mbg.mapper;

import com.sora.demo.mbg.model.Sign_in;
import com.sora.demo.mbg.model.Sign_inExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Sign_inMapper {
    long countByExample(Sign_inExample example);

    int deleteByExample(Sign_inExample example);

    int deleteByPrimaryKey(Integer signInId);

    int insert(Sign_in record);

    int insertSelective(Sign_in record);

    List<Sign_in> selectByExample(Sign_inExample example);

    Sign_in selectByPrimaryKey(Integer signInId);

    int updateByExampleSelective(@Param("record") Sign_in record, @Param("example") Sign_inExample example);

    int updateByExample(@Param("record") Sign_in record, @Param("example") Sign_inExample example);

    int updateByPrimaryKeySelective(Sign_in record);

    int updateByPrimaryKey(Sign_in record);
}