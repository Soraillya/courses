package com.sora.demo.controller;

import com.sora.demo.mbg.model.Teacher;
import com.sora.demo.service.TeacherService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@Api("TeacherController")
@Controller
public class TeacherController {

    @Resource
    private TeacherService teacherService;

    @ApiOperation("查找所有讲师")
    @GetMapping("/listAllTeachers")
    @ResponseBody
    public List<Teacher> getAllTeachers(){
        return teacherService.listAllTeacher();
    }

    @ApiOperation("添加讲师")
    @PostMapping("/createTeacher")
    @ResponseBody
    public String createTeacher(Teacher teacher){
        return teacherService.createTeacher(teacher) != -1 ? "1" : "0";
    }

    @ApiOperation("检索讲师")
    @GetMapping("/retrieveTeacher/{id}")
    @ResponseBody
    public Teacher retrieveTeacher(@PathVariable Integer id){
        return teacherService.retrieveTeacher(id);
    }

    @ApiOperation("更新讲师")
    @PostMapping("/updateTeacher")
    @ResponseBody
    public String updateTeacher(Teacher teacher){
        return teacherService.updateTeacher(teacher) != -1 ? "1" : "0";
    }

    @ApiOperation("删除讲师")
    @DeleteMapping("/deleteTeacher")
    @ResponseBody
    public String deleteTeacher(Integer id){
        return teacherService.deleteTeacher(id) != -1 ? "1" : "0";
    }
}
