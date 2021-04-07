package com.sora.demo.controller;

import com.sora.demo.service.UserService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Api("UserController")
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/login")
    public String loginUI(){
        return "/login";
    }

    @GetMapping("/logout")
    public String logout() {
        return "/login";
    }

    @PostMapping("/login")
    public String login(String username, String password, Model model){

        //检索是否有username
        boolean f1 = userService.retrieveUserByUsername(username);
        //返回一个标志位f1，有用户为true，无用户为false
        if (!f1) {
            model.addAttribute("login_1", true);
            return "/login";
        }
        //有用户，检测密码是否正确
        boolean f2 = userService.checkUsernameAndPassword(username, password);
        //返回一个标志位f2，密码正确为true，密码错误为false
        if (!f2) {
            model.addAttribute("login_2",true);
            return "/login";
        }
        //用户和密码正确，检测账号角色是管理员或讲师
        boolean f3 = userService.checkUser_Status(username, password);
        //返回一个标志位f3，管理员为true，讲师为false
        if (f3) {
            return "redirect:/adminHome";
        } else {
            return "redirect:/teacherHome";
        }
    }
}
