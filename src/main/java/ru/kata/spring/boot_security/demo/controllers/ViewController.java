package ru.kata.spring.boot_security.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewController {

    @GetMapping(value = "/admin")
    public String usersList() {
        return "users";
    }

    @GetMapping("/user")
    public String userPage() {
        return "users";
    }
}
