package com.example.dockerTest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("/test")
    String getTest()
    {
        return "Hello from test controller in this java spring app ++ webhook";
    }
}

