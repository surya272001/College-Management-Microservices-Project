package com.ust.CourseService.client;

import com.ust.CourseService.model.Course;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Fullresponse {

        // Getters and Setters

        private Long cid;

        private String name;

        private String code;

        private String description;
        private int credits;
        public List<Student> students;
}




