package com.pmr.elastic.services;

import com.pmr.elastic.model.Product;
import com.pmr.elastic.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;

    public Product createProduct(Product product) {
        return productRepository.save(product);
    }

    public Iterable<Product> getProducts() {
        return productRepository.findAll();
    }
}
