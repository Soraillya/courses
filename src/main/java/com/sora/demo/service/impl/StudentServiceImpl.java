package com.sora.demo.service.impl;

import com.sora.demo.mbg.mapper.StudentMapper;
import com.sora.demo.mbg.model.Student;
import com.sora.demo.mbg.model.StudentExample;
import com.sora.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public List<Student> listAllStudent() {
        return studentMapper.selectByExample(new StudentExample());
    }

    @Override
    public int createStudent(Student student) {
        return studentMapper.insertSelective(student);
    }

    @Override
    public Student retrieveStudent(int id) {
        return studentMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateStudent(Student student) {
        return studentMapper.updateByPrimaryKeySelective(student);
    }

    @Override
    public int deleteStudent(int id) {
        return studentMapper.deleteByPrimaryKey(id);
    }
}
