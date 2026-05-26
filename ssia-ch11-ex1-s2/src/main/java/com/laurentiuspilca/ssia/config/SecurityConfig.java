package com.laurentiuspilca.ssia.config;

import com.laurentiuspilca.ssia.authentication.providers.OtpAuthenticationProvider;
import com.laurentiuspilca.ssia.authentication.providers.UsernamePasswordAuthenticationProvider;
import com.laurentiuspilca.ssia.authentication.filters.InitialAuthenticationFilter;
import com.laurentiuspilca.ssia.authentication.filters.JwtAuthenticationFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.authentication.www.BasicAuthenticationFilter;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private InitialAuthenticationFilter initialAuthenticationFilter;

    @Autowired
    private JwtAuthenticationFilter jwtAuthenticationFilter;

    @Autowired
    private OtpAuthenticationProvider otpAuthenticationProvider;

    @Autowired
    private UsernamePasswordAuthenticationProvider usernamePasswordAuthenticationProvider;

    @Override
    protected void configure(AuthenticationManagerBuilder auth) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    @Bean
    protected AuthenticationManager authenticationManager() throws Exception {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
