package com.capgemini.Spring_Security_HandsOn.controller;

import com.capgemini.Spring_Security_HandsOn.model.User;
import com.capgemini.Spring_Security_HandsOn.repository.UserRepository;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public UserController(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @PostMapping("/register")
    public String registerUser(@RequestBody User user){
        // encrypt password before saving
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        userRepository.save(user);
        return "user register successfully!";
    }

    @GetMapping("/all")
    public List<User> getAllUser(){
        return userRepository.findAll();
    }
}