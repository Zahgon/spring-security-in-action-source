package com.laurentiuspilca.ssia.controllers;

import com.laurentiuspilca.ssia.services.NameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private NameService nameService;

    @GetMapping("/hello")
    public String hello() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
