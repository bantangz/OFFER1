package com.main.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@SpringBootApplication
@ComponentScan("com.main.config.h")
public class SpringBoot {
    public static void main(String[] args) {
        SpringApplication.run(SpringBoot.class);
    }

}
