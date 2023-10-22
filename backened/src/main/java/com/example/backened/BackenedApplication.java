package com.example.backened;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com/example/backened/mapper")
public class BackenedApplication {

    public static void main(String[] args) {
        SpringApplication.run(BackenedApplication.class, args);
    }

}
