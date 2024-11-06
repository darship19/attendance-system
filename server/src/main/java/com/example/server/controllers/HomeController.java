package com.example.server.controllers;

import com.example.server.models.User;
import com.example.server.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/home")
public class HomeController {
    @Autowired
    private UserService userService;
    @GetMapping
    public Map<String, String> welcomeMessage(Principal principal) {
        String username = "Guest";

        if (principal != null) {
            String email = principal.getName();
            User user = userService.getUserByEmail(email).orElse(null);
            if (user != null) {
                username = user.getName();
            }
        }
        Map<String, String> response = new HashMap<>();
        response.put("message", "Welcome to the home page, " + username + "!");
        response.put("username", username);

        return response;

    }


}
