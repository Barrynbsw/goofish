package com.example.backened;

import jakarta.servlet.annotation.WebFilter;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com/example/backened/mapper")
@WebFilter(filterName = "LoginCheckFilter",urlPatterns = "/*")
public class BackenedApplication {

    public static void main(String[] args) {
        SpringApplication.run(BackenedApplication.class, args);
    }

}
