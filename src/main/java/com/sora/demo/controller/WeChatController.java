package com.sora.demo.controller;

import com.sora.demo.mbg.model.Course;
import com.sora.demo.service.CourseService;
import com.sora.demo.service.UserService;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@Api("WeChatController")
@RestController
public class WeChatController {
    @Resource
    private UserService userService;
    @Resource
    private CourseService courseService;

    @GetMapping("/hello")
    public String hello(){
        return "hello,这是数据";
    }

    @GetMapping("/demo/{id}")
    public String demo(@PathVariable("id") String id) {
        System.out.println("id="+id);
        return id;
    }

    @GetMapping("/demo2")
    public String demo2(@RequestParam("age") String age) {
        System.out.println("age="+age);
        return age+"2";
    }

    @GetMapping("/wxLogin")
    public String wxLogin(@RequestParam("username") String username, @RequestParam("password") String password) {
        //检索是否有username
        boolean f1 = userService.retrieveStudentByUsername(username);
        //返回一个标志位f1，有用户为true，无用户为false
        if (!f1) {
            //model.addAttribute("login_1", true);
            return "用户不存在";
        }
        //有用户，检测密码是否正确
        boolean f2 = userService.checkStudentUsernameAndPassword(username, password);
        //返回一个标志位f2，密码正确为true，密码错误为false
        if (!f2) {
            //model.addAttribute("login_2",true);
            return "密码不正确";
        }
        return "登录成功";
    }

    @GetMapping("/wxGetAllCourseList")
    @ResponseBody
    public List<Course> wxGetAllCourseList(){
        return courseService.listAllCourse();
    }

}
