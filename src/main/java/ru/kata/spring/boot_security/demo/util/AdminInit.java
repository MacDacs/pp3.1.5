package ru.kata.spring.boot_security.demo.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Component;
import ru.kata.spring.boot_security.demo.Service.UserServiceImpl;
import ru.kata.spring.boot_security.demo.model.User;


import javax.annotation.PostConstruct;


@Component
public class AdminInit {

    private final UserServiceImpl userService;
    private final UserDetailsService userDetailsService;

    @Autowired
    public AdminInit(UserServiceImpl userService, UserDetailsService userDetailsService) {
        this.userService = userService;

        this.userDetailsService = userDetailsService;
    }

    @PostConstruct
    public void Init() {

        User admin = new User("adminka",
                "admin"
        );


        userService.addUser(admin);
    }
}