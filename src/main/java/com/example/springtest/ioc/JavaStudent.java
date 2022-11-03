package com.example.springtest.ioc;

public class JavaStudent implements Teacher{
    @Override
    public void code() {
        System.out.println("Java student");
    }

    @Override
    public void speed() {
        System.out.println("Java student");
    }
}
