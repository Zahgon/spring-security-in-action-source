package com.laurentiuspilca.ssia.controllers;

import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public Mono<String> hello(Mono<Authentication> auth) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @GetMapping("/ciao")
    public Mono<String> ciao() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
