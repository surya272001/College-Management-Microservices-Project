package com.ust.GradeService.repository;

import com.ust.GradeService.model.Grade;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GradeRepository extends JpaRepository<Grade, Long> {
    Grade findByGid(Long gid);
}
