package com.laurentiuspilca.ssia.model;

import java.util.Objects;

public class Product {

    private String name;

    private String owner;

    public Product(String name, String owner) {
        this.name = name;
        this.owner = owner;
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

    @Override
    public boolean equals(Object o) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public int hashCode() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
