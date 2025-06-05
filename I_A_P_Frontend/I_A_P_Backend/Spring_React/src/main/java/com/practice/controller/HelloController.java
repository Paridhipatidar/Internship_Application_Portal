package com.practice.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:5173") // Vite runs on 5173
public class HelloController {

 @GetMapping("/hello")
 public String sayHello() {
     return "Hello from Spring Boot!";
 }
}
