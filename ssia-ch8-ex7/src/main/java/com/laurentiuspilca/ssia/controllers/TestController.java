package com.laurentiuspilca.ssia.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/email/{email}")
    public String video(@PathVariable String email) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
