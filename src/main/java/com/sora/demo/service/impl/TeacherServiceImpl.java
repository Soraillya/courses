package com.sora.demo.service.impl;

import com.sora.demo.mbg.mapper.TeacherMapper;
import com.sora.demo.mbg.model.Teacher;
import com.sora.demo.mbg.model.TeacherExample;
import com.sora.demo.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherServiceImpl implements TeacherService {

    @Autowired
    private TeacherMapper teacherMapper;

    @Override
    public List<Teacher> listAllTeacher() {
        return teacherMapper.selectByExample(new TeacherExample());
    }

    @Override
    public int createTeacher(Teacher teacher) {
        return teacherMapper.insertSelective(teacher);
    }

    @Override
    public Teacher retrieveTeacher(int id) {
        return teacherMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateTeacher(Teacher teacher) {
        return teacherMapper.updateByPrimaryKeySelective(teacher);
    }

    @Override
    public int deleteTeacher(int id) {
        return teacherMapper.deleteByPrimaryKey(id);
    }
}
