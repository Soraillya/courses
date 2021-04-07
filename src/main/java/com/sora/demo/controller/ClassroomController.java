package com.sora.demo.controller;

import com.sora.demo.mbg.model.Classroom;
import com.sora.demo.service.ClassroomService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@Api("ClassroomController")
@Controller
public class ClassroomController {

    @Resource
    private ClassroomService classroomService;

    @ApiOperation("查找所有教室")
    @GetMapping("/listAllClassrooms")
    @ResponseBody
    public List<Classroom> getAllClassrooms(){
        return classroomService.listAllClassroom();
    }

    @ApiOperation("添加教室")
    @PostMapping("/createClassroom")
    @ResponseBody
    public String createClassroom(Classroom classroom){
        return classroomService.createClassroom(classroom) != -1 ? "1" : "0";
    }

    @ApiOperation("检索教室")
    @GetMapping("/retrieveClassroom/{id}")
    @ResponseBody
    public Classroom retrieveClassroom(@PathVariable Integer id){
        return classroomService.retrieveClassroom(id);
    }

    @ApiOperation("更新教室")
    @PostMapping("/updateClassroom")
    @ResponseBody
    public String updateClassroom(Classroom classroom){
        return classroomService.updateClassroom(classroom) != -1 ? "1" : "0";
    }

    @ApiOperation("删除教室")
    @DeleteMapping("/deleteClassroom")
    @ResponseBody
    public String deleteClassroom(Integer id){
        return classroomService.deleteClassroom(id) != -1 ? "1" : "0";
    }

}
