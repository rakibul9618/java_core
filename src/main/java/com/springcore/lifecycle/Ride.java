package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Ride implements InitializingBean, DisposableBean {
    private double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("I am interface type initialing method");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("I am interface type destroying method");
    }

    @Override
    public String toString() {
        return "Ride{" +
                "price=" + price +
                '}';
    }





}
