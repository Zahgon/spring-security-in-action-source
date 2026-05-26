package com.laurentiuspilca.ssia.config;

import com.laurentiuspilca.ssia.model.User;
import com.laurentiuspilca.ssia.services.InMemoryUserDetailsService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import java.util.List;

@Configuration
public class ProjectConfig {

    @Bean
    public UserDetailsService userDetailsService() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
