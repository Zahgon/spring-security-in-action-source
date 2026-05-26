package com.laurentiuspilca.ssia.services;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;

@Service
public class NameService {

    @PreAuthorize("hasAuthority('write')")
    public String getName() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
