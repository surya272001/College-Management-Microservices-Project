package com.ust.GradeService.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "grade")
public class Grade {
    @Id
    private Long gid;
    private Long id;
    private Long cid;
    private String grade;
    private Date examDate;
    private String remarks;
}
