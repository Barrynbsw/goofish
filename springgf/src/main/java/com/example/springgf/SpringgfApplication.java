package com.example.springgf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.servlet.annotation.WebFilter;

@SpringBootApplication
@WebFilter(filterName = "LoginCheckFilter",urlPatterns = "/*")
public class SpringgfApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringgfApplication.class, args);
    }

}
