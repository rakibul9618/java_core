package com.springcore.autoWiring.annotation;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {
    static public  void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("anotationAutoWiringConfig.xml");
        Employee employee = context.getBean("employee", Employee.class);
        System.out.println(employee.getName());
        System.out.println(employee.getPhoneNumber());
    }
}









