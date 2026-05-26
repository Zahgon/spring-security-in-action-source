package com.laurentiuspilca.ssia.controllers;

import com.laurentiuspilca.ssia.services.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.security.concurrent.DelegatingSecurityContextCallable;
import org.springframework.security.concurrent.DelegatingSecurityContextExecutorService;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@RestController
public class HelloController {

    @Autowired
    private HelloService helloService;

    @GetMapping("/hello")
    public String hello(Authentication a) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @GetMapping("/bye")
    @Async
    public void goodbye() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @GetMapping("/ciao")
    public String ciao() throws Exception {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @GetMapping("/hola")
    public String hola() throws Exception {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
