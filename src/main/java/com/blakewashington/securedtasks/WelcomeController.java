package com.blakewashington.securedtasks;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @GetMapping("/welcome")
    public String WelcomeMessage() {
        return "Welcome to the Task Manager!";
    }
}
