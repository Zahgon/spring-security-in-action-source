package com.laurentiuspilca.ssia.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @PostMapping("/a")
    public String postEndpointA() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @GetMapping("/a")
    public String getEndpointA() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @GetMapping("/a/b")
    public String getEnpointB() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @GetMapping("/a/b/c")
    public String getEnpointC() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
