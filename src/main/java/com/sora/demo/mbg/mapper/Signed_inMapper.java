package com.sora.demo.mbg.mapper;

import com.sora.demo.mbg.model.Signed_in;
import com.sora.demo.mbg.model.Signed_inExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Signed_inMapper {
    long countByExample(Signed_inExample example);

    int deleteByExample(Signed_inExample example);

    int deleteByPrimaryKey(Integer signedInId);

    int insert(Signed_in record);

    int insertSelective(Signed_in record);

    List<Signed_in> selectByExample(Signed_inExample example);

    Signed_in selectByPrimaryKey(Integer signedInId);

    int updateByExampleSelective(@Param("record") Signed_in record, @Param("example") Signed_inExample example);

    int updateByExample(@Param("record") Signed_in record, @Param("example") Signed_inExample example);

    int updateByPrimaryKeySelective(Signed_in record);

    int updateByPrimaryKey(Signed_in record);
}