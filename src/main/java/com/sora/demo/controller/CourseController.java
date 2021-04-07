package com.sora.demo.controller;

import com.sora.demo.mbg.model.Course;
import com.sora.demo.service.CourseService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@Api("CourseController")
@Controller
public class CourseController {

    @Resource
    private CourseService courseService;

    @ApiOperation("查找所有课程")
    @GetMapping("/listAllCourses")
    @ResponseBody
    public List<Course> getAllCourses(){
        return courseService.listAllCourse();
    }

    @ApiOperation("添加课程")
    @PostMapping("/createCourse")
    @ResponseBody
    public String createCourse(Course course){
        return courseService.createCourse(course) != -1 ? "1" : "0";
    }

    @ApiOperation("检索课程")
    @GetMapping("/retrieveCourse/{id}")
    @ResponseBody
    public Course retrieveCourse(@PathVariable Integer id){
        return courseService.retrieveCourse(id);
    }

    @ApiOperation("更新课程")
    @PostMapping("/updateCourse")
    @ResponseBody
    public String updateCourse(Course course){
        return courseService.updateCourse(course) != -1 ? "1" : "0";
    }

    @ApiOperation("删除课程")
    @DeleteMapping("/deleteCourse")
    @ResponseBody
    public String deleteCourse(Integer id){
        return courseService.deleteCourse(id) != -1 ? "1" : "0";
    }

}
