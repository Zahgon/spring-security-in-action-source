package com.laurentiuspilca.ssia.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/main")
    public String main() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
