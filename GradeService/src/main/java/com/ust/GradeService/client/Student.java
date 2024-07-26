package com.ust.GradeService.client;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Student {

    public Long id;
    public String firstname;
    public String lastname;
    public String email;
    public Long cid;
    public Long gid;
}
