package com.laurentiuspilca.ssia.entities;

import javax.persistence.*;

@Entity
public class Authority {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    @JoinColumn(name = "user")
    @ManyToOne
    private User user;

    public Integer getId() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setId(Integer id) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String getName() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setName(String name) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public User getUser() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setUser(User user) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
