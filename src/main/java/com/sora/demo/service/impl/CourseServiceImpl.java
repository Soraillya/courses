package com.sora.demo.service.impl;

import com.sora.demo.mbg.mapper.CourseMapper;
import com.sora.demo.mbg.model.Course;
import com.sora.demo.mbg.model.CourseExample;
import com.sora.demo.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {

    @Autowired
    private CourseMapper courseMapper;

    @Override
    public List<Course> listAllCourse() {
        return courseMapper.selectByExample(new CourseExample());
    }

    @Override
    public int createCourse(Course course) {
        return courseMapper.insertSelective(course);
    }

    @Override
    public Course retrieveCourse(int id) {
        return courseMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateCourse(Course course) {
        return courseMapper.updateByPrimaryKeySelective(course);
    }

    @Override
    public int deleteCourse(int id) {
        return courseMapper.deleteByPrimaryKey(id);
    }
}
