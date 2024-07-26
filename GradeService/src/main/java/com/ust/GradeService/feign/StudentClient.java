package com.ust.GradeService.feign;

import com.ust.GradeService.client.Student;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import com.ust.GradeService.feign.StudentClient;


import java.util.List;

@FeignClient(name="StudentService", url="http://localhost:9099/student")
public interface StudentClient {

    @GetMapping("grade/{gid}")
    List<Student> findStudentsByGid(@PathVariable("gid") Long gid);

}