package com.ernane.controller;

import java.util.List;
import com.ernane.model.Course;
import com.ernane.repository.CourseRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//import lombok.AllArgsConstructor;

@RestController
@RequestMapping("api/courses")
//@AllArgsConstructor
public class CoursesController {

   @Autowired
    private CourseRepository courseRepository;    

    @GetMapping
    public @ResponseBody List<Course> list(){
        return courseRepository.findAll();
    }

}
