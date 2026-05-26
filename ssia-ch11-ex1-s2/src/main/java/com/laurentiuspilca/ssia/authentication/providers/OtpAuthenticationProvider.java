package com.laurentiuspilca.ssia.authentication.providers;

import com.laurentiuspilca.ssia.authentication.OtpAuthentication;
import com.laurentiuspilca.ssia.authentication.proxy.AuthenticationServerProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.stereotype.Component;

@Component
public class OtpAuthenticationProvider implements AuthenticationProvider {

    @Autowired
    private AuthenticationServerProxy proxy;

    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public boolean supports(Class<?> aClass) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
