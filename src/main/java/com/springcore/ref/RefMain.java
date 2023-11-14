package com.springcore.ref;

import com.springcore.Student;
import com.springcore.collections.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RefMain {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        ApplicationContext context = new ClassPathXmlApplicationContext("refConfig.xml");
        A ref = (A) context.getBean("aref");
        System.out.println(ref);
    }
}