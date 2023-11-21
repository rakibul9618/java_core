package com.springcore.autoWiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {
    static public  void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("autoWiringConfig.xml");
        Employee employee = context.getBean("employee", Employee.class);
        System.out.println(employee);
    }
}









