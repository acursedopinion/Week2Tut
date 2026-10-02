package com.example.tuteone;

import jakarta.websocket.server.PathParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class APIController {
    @GetMapping("/home")
    public String home() {
        return "<h1>Hello</h1>";
    }

    @GetMapping("/info")
    public String version() {
        return "Ver. 2.5.0";
    }

    @GetMapping("/goodbye")
    public String goodbye() {
        return "Goodbye from Spring Boot!";
    }


}
