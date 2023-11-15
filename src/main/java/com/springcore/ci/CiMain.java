package com.springcore.ci;

import com.springcore.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CiMain {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        ApplicationContext context = new ClassPathXmlApplicationContext("CiConfig.xml");
        Person per = (Person) context.getBean("person1");
        System.out.println(per);
    }
}
