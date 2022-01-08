package com.example.cicd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CiCdActionsApplication {

    public static void main(String[] args) {
        SpringApplication.run(CiCdActionsApplication.class, args);
    }

    @GetMapping
    public String welcome() {
        return "Welcome to ci cd";
    }

    @GetMapping("/g")
    public String greeting() {
        return "greeting";
    }


}
