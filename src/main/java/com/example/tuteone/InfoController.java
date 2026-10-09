package com.example.tuteone;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InfoController {
    @GetMapping("/information")
    public String information() {
        return "This is an API for week two.";
    }
}
