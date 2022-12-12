package com.pmr.elastic.web;

import com.pmr.elastic.model.Product;
import com.pmr.elastic.services.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/v1")
public class ElasticController {

    @Autowired
    private ProductService productService;

    @GetMapping("/hello")
    public String hello() {
        return "Hello1";
    }

    @GetMapping("/products")
    public Iterable<Product> getProducts() {
        return productService.getProducts();
    }

    @PostMapping("product")
    public Product saveProduct(@RequestBody Product product) {
        log.info(String.valueOf(product));
        return productService.createProduct(product);
    }


}
