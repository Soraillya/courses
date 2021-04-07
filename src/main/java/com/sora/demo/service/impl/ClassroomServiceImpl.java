package com.sora.demo.service.impl;

import com.sora.demo.mbg.mapper.ClassroomMapper;
import com.sora.demo.mbg.model.Classroom;
import com.sora.demo.mbg.model.ClassroomExample;
import com.sora.demo.service.ClassroomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassroomServiceImpl implements ClassroomService {

    @Autowired
    private ClassroomMapper classroomMapper;

    @Override
    public List<Classroom> listAllClassroom() {
        return classroomMapper.selectByExample(new ClassroomExample());
    }

    @Override
    public int createClassroom(Classroom classroom) {
        return classroomMapper.insertSelective(classroom);
    }

    @Override
    public Classroom retrieveClassroom(int id) {
        return classroomMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateClassroom(Classroom classroom) {
        return classroomMapper.updateByPrimaryKeySelective(classroom);
    }

    @Override
    public int deleteClassroom(int id) {
        return classroomMapper.deleteByPrimaryKey(id);
    }
}
