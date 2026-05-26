package com.laurentiuspilca.ssia.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    private String owner;

    public int getId() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setId(int id) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String getName() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setName(String name) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String getOwner() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setOwner(String owner) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
