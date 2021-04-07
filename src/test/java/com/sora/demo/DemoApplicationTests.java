package com.sora.demo;

import com.sora.demo.service.CourseService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class DemoApplicationTests {

    @Resource
    private CourseService courseService;

    @Test
    void contextLoads() {
        System.out.println(courseService.listAllCourse());
    }

}
