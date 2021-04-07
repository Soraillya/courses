package com.sora.demo.service;

import com.sora.demo.mbg.model.Student;

import java.util.List;

public interface StudentService {
    List<Student> listAllStudent();

    int createStudent(Student student);

    Student retrieveStudent(int id);

    int updateStudent(Student student);

    int deleteStudent(int id);
}
