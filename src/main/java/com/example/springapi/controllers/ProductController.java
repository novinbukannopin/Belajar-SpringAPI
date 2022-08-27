package com.example.springapi.controllers;

import com.example.springapi.models.entities.Product;
import com.example.springapi.services.ProductServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author Novin on 27/08/2022
 * @project springapi
 */
@RestController
@RequestMapping("/api/products")
public class ProductController {

    @Autowired
    private ProductServices productServices;

    @PostMapping
    public Product create(@RequestBody Product product) {
        return productServices.save(product);
    }

    @GetMapping
    public Iterable<Product> findAll() {
        return productServices.findAll();
    }

    @GetMapping("/{id}")
    public Product findOne(@PathVariable("id") Long id){
        return productServices.findById(id);
    }

    @PutMapping
    public Product product(@RequestBody Product product){
        return productServices.save(product);
    }

    @DeleteMapping("/{id}")
    public void removeOne(@PathVariable("id") Long id){
        productServices.removeOne(id);
    }
}
