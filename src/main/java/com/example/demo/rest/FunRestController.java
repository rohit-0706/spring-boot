package com.example.demo.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    // expose "/" endpoint that return hello world!
    @GetMapping("/")
    public String Sayhello(){
        return "Hello World!" ;
    }
}
