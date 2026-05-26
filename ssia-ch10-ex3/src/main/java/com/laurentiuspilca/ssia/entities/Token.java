package com.laurentiuspilca.ssia.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Token {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String identifier;

    private String token;

    public int getId() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setId(int id) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String getIdentifier() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setIdentifier(String identifier) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String getToken() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setToken(String token) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
