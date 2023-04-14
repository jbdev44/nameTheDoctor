package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyBigProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyBigProjectApplication.class, args);
        System.out.println("l'application s'est lancée");
    }

}
