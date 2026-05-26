package com.laurentiuspilca.ssia.services;

import org.springframework.scheduling.annotation.Async;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

@Service
public class HelloService {

    @Async
    public String getName() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
