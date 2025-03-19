package com.capgemini.Spring_Security_HandsOn.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class SecurityController {

    @GetMapping("/sayHello")
    public String sayHello(){
        return "Hello from Spring Security";
    }

    @GetMapping("/sayBye")
    public String sayBye(){
        return "Good Bye to Spring Security";
    }

}
