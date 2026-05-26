package com.laurentiuspilca.ssia.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("/home")
    public String home() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
