package com.ust.GradeService.controller;

import com.ust.GradeService.client.Fullresponse;
import com.ust.GradeService.model.Grade;
import com.ust.GradeService.service.GradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("grade")
public class GradeController {
    @Autowired
    private GradeService service;

    @PostMapping("/addgrade")
    public Grade saveGrade(@RequestBody Grade grade) {
        return service.saveGrade(grade);
    }
    @GetMapping("withstudents/{gid}")
    public ResponseEntity<Fullresponse> findGradeByGid(@PathVariable("gid") Long gid){
        return ResponseEntity.ok(service.findGradeByGid(gid));
    }
}
