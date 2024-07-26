package com.college.Student_Services.repository;

import com.college.Student_Services.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Long> {
    List<Student> findByCid(Long cid);
}
