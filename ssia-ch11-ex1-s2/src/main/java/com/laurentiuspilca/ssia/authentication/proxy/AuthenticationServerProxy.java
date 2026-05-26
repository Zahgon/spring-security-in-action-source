package com.laurentiuspilca.ssia.authentication.proxy;

import com.laurentiuspilca.ssia.authentication.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class AuthenticationServerProxy {

    @Autowired
    private RestTemplate rest;

    @Value("${auth.server.base.url}")
    private String baseUrl;

    public void sendAuth(String username, String password) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public boolean sendOTP(String username, String code) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
