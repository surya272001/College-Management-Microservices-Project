package com.ust.GradeService.client;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Fullresponse {
    private Long gid;
    private Long id;
    private Long cid;
    private String grade;
    private Date examDate;
    private String remarks;
    public List<Student> students;
}
