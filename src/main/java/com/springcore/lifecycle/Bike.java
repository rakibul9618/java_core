package com.springcore.lifecycle;

public class Bike {
    private double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        System.out.println("I am price setter method");
        this.price = price;
    }

    public void  init() {
        System.out.println("I am initialing method");
    }
    public void destroy() {
        System.out.println("I am destroy route");
    }

    @Override
    public String toString() {
        return "Bike{" +
                "price=" + price +
                '}';
    }
}
