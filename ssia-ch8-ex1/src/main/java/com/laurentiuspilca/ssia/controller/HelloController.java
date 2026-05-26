package com.laurentiuspilca.ssia.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @GetMapping("/ciao")
    public String ciao() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @GetMapping("/hola")
    public String hola() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
