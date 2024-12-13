package com.example.kahootcl.health;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/health")
public class ApplicationStatusController {


    @Value("${spring.application.name}")
    private String name;

    @GetMapping("/status")
    public String getStatus() {
        return "Application is running. Name: " + name;
    }

}
