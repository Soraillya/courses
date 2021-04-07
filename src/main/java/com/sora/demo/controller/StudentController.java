package com.sora.demo.controller;

import com.sora.demo.mbg.model.Student;
import com.sora.demo.service.StudentService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@Api("StudentController")
@Controller
public class StudentController {

    @Resource
    private StudentService studentService;

    @ApiOperation("查找所有学生")
    @GetMapping("/listAllStudent")
    @ResponseBody
    public List<Student> getAllStudent(){
        return studentService.listAllStudent();
    }

    @ApiOperation("添加学生")
    @PostMapping("/createStudent")
    @ResponseBody
    public String createStudent(Student student){
        return studentService.createStudent(student) != -1 ? "1" :"0";
    }

    @ApiOperation("检索学生")
    @GetMapping("/retrieveStudent/{id}")
    @ResponseBody
    public Student retrieveStudent(@PathVariable Integer id){
        return studentService.retrieveStudent(id);
    }

    @ApiOperation("删除学生")
    @DeleteMapping("/deleteStudent")
    @ResponseBody
    public String deleteStudent(Integer id){
        return studentService.deleteStudent(id) != -1 ? "1" : "0";
    }



}
