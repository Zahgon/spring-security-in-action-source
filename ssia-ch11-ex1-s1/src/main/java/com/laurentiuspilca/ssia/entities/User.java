package com.laurentiuspilca.ssia.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {

    @Id
    private String username;

    private String password;

    public String getUsername() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setUsername(String username) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String getPassword() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setPassword(String password) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
