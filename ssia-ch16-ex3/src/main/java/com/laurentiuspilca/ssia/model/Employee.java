package com.laurentiuspilca.ssia.model;

import java.util.List;
import java.util.Objects;

public class Employee {

    private String name;

    private List<String> books;

    private List<String> roles;

    public Employee(String name, List<String> books, List<String> roles) {
        this.name = name;
        this.books = books;
        this.roles = roles;
    }

    public String getName() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setName(String name) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public List<String> getBooks() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setBooks(List<String> books) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public List<String> getRoles() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setRoles(List<String> roles) {
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
