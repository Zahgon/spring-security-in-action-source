package com.laurentiuspilca.ssia.entities;

import com.laurentiuspilca.ssia.entities.enums.Currency;
import javax.persistence.*;

@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private double price;

    @Enumerated(EnumType.STRING)
    private Currency currency;

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

    public double getPrice() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setPrice(double price) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Currency getCurrency() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setCurrency(Currency currency) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
