package com.example.springtest;

import com.example.springtest.ioc.Teacher;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringTestApplication {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        Teacher myTeacherJava = context.getBean("myTeacherJava", Teacher.class);
        myTeacherJava.code();
        myTeacherJava.speed();

        Teacher myTeacherJs = context.getBean("myTeacherJs", Teacher.class);
        myTeacherJs.code();
        myTeacherJs.speed();

        context.close();
    }
}
