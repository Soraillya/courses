package com.sora.demo.mbg.mapper;

import com.sora.demo.mbg.model.Student_order;
import com.sora.demo.mbg.model.Student_orderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Student_orderMapper {
    long countByExample(Student_orderExample example);

    int deleteByExample(Student_orderExample example);

    int deleteByPrimaryKey(Integer studentOrderId);

    int insert(Student_order record);

    int insertSelective(Student_order record);

    List<Student_order> selectByExample(Student_orderExample example);

    Student_order selectByPrimaryKey(Integer studentOrderId);

    int updateByExampleSelective(@Param("record") Student_order record, @Param("example") Student_orderExample example);

    int updateByExample(@Param("record") Student_order record, @Param("example") Student_orderExample example);

    int updateByPrimaryKeySelective(Student_order record);

    int updateByPrimaryKey(Student_order record);
}