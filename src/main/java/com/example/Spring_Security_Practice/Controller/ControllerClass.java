package com.example.Spring_Security_Practice.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/security")
public class ControllerClass {



    @GetMapping("/check")
    public String secchk(){
        return "Hello Sir";
    }
}
