package com.ust.GradeService.service;

import com.ust.GradeService.client.Fullresponse;
import com.ust.GradeService.client.Student;
import com.ust.GradeService.feign.StudentClient;
import com.ust.GradeService.model.Grade;
import com.ust.GradeService.repository.GradeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class GradeService {
    @Autowired
    private GradeRepository repo;
    @Autowired
    private StudentClient client;

    public Grade saveGrade(Grade grade) {
        return repo.save(grade);
    }


    public Fullresponse findGradeByGid(Long gid) {
        Grade c = repo.findByGid(gid);
        List<Student> list = client.findStudentsByGid(gid);
        Fullresponse res = new Fullresponse();
        res.setGid(c.getGid());
        res.setId(c.getId());
        res.setCid(c.getCid());
        res.setGrade(c.getGrade());
        res.setExamDate(c.getExamDate());
        res.setRemarks(c.getRemarks());
        res.setStudents(list);

        return res;


    }
}
