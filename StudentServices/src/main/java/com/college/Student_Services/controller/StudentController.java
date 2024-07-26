package com.college.Student_Services.controller;

import com.college.Student_Services.model.Student;
import com.college.Student_Services.service.StudentService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/addstudents")
    public ResponseEntity<Student> addProducts(@RequestBody @Valid Student studentList) {
        return new ResponseEntity<>(studentService.addStudents(studentList), HttpStatus.CREATED);
    }
    @GetMapping("course/{cid}")
    public ResponseEntity<List<Student>> getStudentsByCid(@PathVariable Long cid) {
        return ResponseEntity.ok(studentService.getStudentsByCid(cid));
    }

}