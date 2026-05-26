package com.laurentiuspilca.ssia.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Otp {

    @Id
    private String username;

    private String code;

    public String getUsername() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setUsername(String username) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String getCode() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setCode(String code) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
