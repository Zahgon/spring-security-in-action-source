package com.laurentiuspilca.ssia.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String getHello() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @PostMapping("/hello")
    public String postHello() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
