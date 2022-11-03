package com.example.springtest.ioc;

public class JsStudent implements Teacher{
    @Override
    public void code() {
        System.out.println("Js student");
    }

    @Override
    public void speed() {
        System.out.println("Js student");
    }
}
