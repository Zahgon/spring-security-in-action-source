package com.laurentiuspilca.ssia.service;

import com.laurentiuspilca.ssia.model.Product;
import org.springframework.security.access.prepost.PostFilter;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

    @PostFilter("filterObject.owner == authentication.principal.username")
    public List<Product> findProducts() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
