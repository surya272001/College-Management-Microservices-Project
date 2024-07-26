package com.ust.CourseService.service;

import com.ust.CourseService.client.Fullresponse;
import com.ust.CourseService.client.Student;
import com.ust.CourseService.feign.StudentClient;
import com.ust.CourseService.model.Course;
import com.ust.CourseService.repo.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service

public class CourseService {



    @Autowired
    private CourseRepository repo;
    @Autowired
    private StudentClient client;
    public Course saveCourse(Course course) {
        return repo.save(course);
    }


    public Fullresponse findCourseByCid(Long cid) {
        Course c = repo.findByCid(cid);
        List<Student> list = client.findStudentsByCid(cid);
        Fullresponse res = new Fullresponse();
        res.setName(c.getName());
        res.setCid(c.getCid());
        res.setCode(c.getCode());
        res.setDescription(c.getDescription());
        res.setCredits(c.getCredits());

        res.setStudents(list);

        return res;


    }
}
