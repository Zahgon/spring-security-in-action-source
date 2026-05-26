package com.laurentiuspilca.ssia.model;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import java.util.Collection;
import java.util.List;

public class User implements UserDetails {

    private final String username;

    private final String password;

    private final String authority;

    public User(String username, String password, String authority) {
        this.username = username;
        this.password = password;
        this.authority = authority;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public String getPassword() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public String getUsername() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public boolean isAccountNonExpired() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public boolean isAccountNonLocked() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public boolean isCredentialsNonExpired() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public boolean isEnabled() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
