package com.sora.demo.service;

import com.sora.demo.mbg.model.Classroom;

import java.util.List;

public interface ClassroomService {
    List<Classroom> listAllClassroom();

    int createClassroom(Classroom classroom);

    Classroom retrieveClassroom(int id);

    int updateClassroom(Classroom classroom);

    int deleteClassroom(int id);
}
