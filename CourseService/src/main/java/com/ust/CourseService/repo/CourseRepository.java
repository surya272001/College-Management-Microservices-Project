package com.ust.CourseService.repo;

import com.ust.CourseService.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;


public interface CourseRepository extends JpaRepository<Course, Long> {
    Course findByCid(Long cid);
}

