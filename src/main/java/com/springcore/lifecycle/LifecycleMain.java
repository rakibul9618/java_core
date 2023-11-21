package com.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LifecycleMain {
   public static void main(String[] args) {
      AbstractApplicationContext context = new ClassPathXmlApplicationContext("lifecycleConfig.xml");
      Bike bike = (Bike) context.getBean("bike");
      Ride ride = (Ride) context.getBean("ride");
      System.out.println(bike);
      System.out.println(ride);
//      shut down hook
      context.registerShutdownHook();
   }
}
