package com.demoDockerJava.controller;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="students")
public class StudentController {

    @GetMapping("/hello")
    public String hello(ModelMap modelMap) {
        return  "Hello World!";
    }
}
