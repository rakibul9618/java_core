package com.springcore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CollectionMain {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        ApplicationContext context = new ClassPathXmlApplicationContext("collectionConfig.xml");
        Employee emp = (Employee) context.getBean("employee1");
        System.out.println(emp);
    }
}