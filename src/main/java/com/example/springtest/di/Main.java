package com.example.springtest.di;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        PythonStudent myPythonStudent = context.getBean("myPythonStudent", PythonStudent.class);

        System.out.println(myPythonStudent.getName());
        System.out.println(myPythonStudent.getAge());
        System.out.println(myPythonStudent.getEmail());
        System.out.println(myPythonStudent.getPhoneNumber());
        myPythonStudent.getTeacher().code();
        myPythonStudent.getTeacher().speed();

        context.close();
    }
}
