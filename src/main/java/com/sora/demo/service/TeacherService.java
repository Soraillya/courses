package com.sora.demo.service;

import com.sora.demo.mbg.model.Teacher;

import java.util.List;

public interface TeacherService {
    List<Teacher> listAllTeacher();

    int createTeacher(Teacher teacher);

    Teacher retrieveTeacher(int id);

    int updateTeacher(Teacher teacher);

    int deleteTeacher(int id);
}
