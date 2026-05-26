package com.laurentiuspilca.ssia.entities;

import com.laurentiuspilca.ssia.entities.enums.EncryptionAlgorithm;
import javax.persistence.*;
import java.util.List;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String username;

    private String password;

    @Enumerated(EnumType.STRING)
    private EncryptionAlgorithm algorithm;

    @OneToMany(mappedBy = "user", fetch = FetchType.EAGER)
    private List<Authority> authorities;

    public Integer getId() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setId(Integer id) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

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

    public EncryptionAlgorithm getAlgorithm() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setAlgorithm(EncryptionAlgorithm algorithm) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public List<Authority> getAuthorities() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setAuthorities(List<Authority> authorities) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
