package com.my.springbd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan(basePackages={"com.my.springbd.controller"})
public class SpringbdApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbdApplication.class, args);
    }

}
