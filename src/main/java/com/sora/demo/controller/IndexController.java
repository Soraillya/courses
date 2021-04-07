package com.sora.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping("/adminHome")
    public String toAdminHome(Model model){
        model.addAttribute("username", "sora_admin");
        return "adminHome";
    }

    @GetMapping("/teacherHome")
    public String toTeacherHome(Model model){

        model.addAttribute("username", "sora_teacher");
        return "teacherHome";
    }
}
