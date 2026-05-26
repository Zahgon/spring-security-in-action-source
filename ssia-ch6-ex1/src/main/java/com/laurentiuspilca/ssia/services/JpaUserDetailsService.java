package com.laurentiuspilca.ssia.services;

import com.laurentiuspilca.ssia.entities.User;
import com.laurentiuspilca.ssia.model.CustomUserDetails;
import com.laurentiuspilca.ssia.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import java.util.function.Supplier;

@Service
public class JpaUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public CustomUserDetails loadUserByUsername(String username) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
