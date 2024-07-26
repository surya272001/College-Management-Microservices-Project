package com.ust.CourseService.controller;


import com.ust.CourseService.client.Fullresponse;
import com.ust.CourseService.model.Course;
import com.ust.CourseService.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("course")
public class CourseController {

    @Autowired
    private CourseService service;

    @PostMapping("/addcourse")
    public Course saveCourse(@RequestBody Course course) {
        return service.saveCourse(course);
    }
    @GetMapping("withstudents/{cid}")
    public ResponseEntity<Fullresponse> findCourseByCid(@PathVariable("cid") Long cid){
        return ResponseEntity.ok(service.findCourseByCid(cid));
    }







}

