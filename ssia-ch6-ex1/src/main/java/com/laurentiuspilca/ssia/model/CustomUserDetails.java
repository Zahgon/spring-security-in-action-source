package com.laurentiuspilca.ssia.model;

import com.laurentiuspilca.ssia.entities.User;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import java.util.Collection;
import java.util.stream.Collectors;

public class CustomUserDetails implements UserDetails {

    private final User user;

    public CustomUserDetails(User user) {
        this.user = user;
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

    public final User getUser() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
