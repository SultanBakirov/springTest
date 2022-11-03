package com.example.springtest.di;

import com.example.springtest.ioc.Teacher;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@NoArgsConstructor
public class PythonStudent {
    private String name;
    private int age;
    private String email;
    private String phoneNumber;
    Teacher teacher;
}
