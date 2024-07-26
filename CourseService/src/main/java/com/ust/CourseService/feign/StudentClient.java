package com.ust.CourseService.feign;

import com.ust.CourseService.client.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.cloud.openfeign.FeignClient;
import java.util.List;

@FeignClient(name="StudentService", url="http://localhost:9099/student")
public interface StudentClient {

    @GetMapping("course/{cid}")
    List<Student>findStudentsByCid(@PathVariable("cid") Long cid);

    }

