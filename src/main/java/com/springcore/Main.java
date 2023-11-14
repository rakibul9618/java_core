package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        Student stud = (Student) context.getBean("student1");
        System.out.println(stud);
    }
}