package com.example.kahootcl.health;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/status")
public class ApplicationStatusController {

    @GetMapping
    public String getStatus() {
        return "Application is running. Name: " + System.getenv("APPLICATION_NAME");
    }

}
