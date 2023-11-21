package com.springcore.javaConfig;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    @Bean
    public Address addressBean () {
        return new Address("Dhaka");
    }

    @Bean
    public Student studentBean () {
        return new Student("Rakibul", addressBean());
    }

}
