package com.laurentiuspilca.ssia.config;

import com.laurentiuspilca.ssia.services.AuthenticationProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.scrypt.SCryptPasswordEncoder;

@Configuration
public class ProjectConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private AuthenticationProviderService authenticationProvider;

    @Bean
    public BCryptPasswordEncoder bCryptPasswordEncoder() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Bean
    public SCryptPasswordEncoder sCryptPasswordEncoder() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
