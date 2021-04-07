package com.sora.demo.service;

import com.sora.demo.mbg.model.Course;

import java.util.List;

public interface CourseService {

    /**
     * 检索所有Course
     * @return List<Course>
     */
    List<Course> listAllCourse();

    /**
     * 添加Course
     * @param course
     * @return int
     */
    int createCourse(Course course);

    /**
     * 检索Course
     * @param id
     * @return Course
     */
    Course retrieveCourse(int id);

    /**
     * 更新Course 通过courseID
     * @param course course
     * @return int
     */
    int updateCourse(Course course);

    /**
     * 删除Course 通过courseID
     * @param id
     * @return int
     */
    int deleteCourse(int id);

}
