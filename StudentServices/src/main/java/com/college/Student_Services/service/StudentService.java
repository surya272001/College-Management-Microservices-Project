package com.college.Student_Services.service;

import com.college.Student_Services.model.Student;
import com.college.Student_Services.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    private StudentRepository repo;

    public Student addStudents(Student StudentList) {
        Student student1 = Student.builder()
                .id(StudentList.getId())
                .firstname(StudentList.getFirstname())
                .lastname(StudentList.getLastname())
                .email(StudentList.getEmail())
                .cid(StudentList.getCid())

                .build();
        return repo.save(student1);
    }

    public List<Student> getStudentsByCid(Long cid) {
        return repo.findByCid(cid);
    }
}

