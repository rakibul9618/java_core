package com.springcore.javaConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestMain {
    public static void main(String[] args) {
        System.out.println("Main");

        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        Student student = context.getBean("studentBean", Student.class);

        System.out.println(student);

     }
}
