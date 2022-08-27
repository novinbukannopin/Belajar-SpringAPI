package com.example.springapi.services;

import com.example.springapi.models.entities.Product;
import com.example.springapi.repos.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

/**
 * @author Novin on 27/08/2022
 * @project springapi
 */

@Service
@Transactional
public class ProductServices {
    @Autowired
    private ProductRepo productRepo;

    public Product save(Product product) {
        return productRepo.save(product);
    }

    public Product findById(Long id) {
        Optional<Product> product = productRepo.findById(id);
        if (!product.isPresent()){
            return null;
        }
        return productRepo.findById(id).get();
    }

    public Iterable<Product> findAll() {
        return productRepo.findAll();
    }

    public void removeOne(Long id) {
        productRepo.deleteById(id);
    }

    public List<Product> findByName(String name){
        return productRepo.findByNameContains(name);
    }

}
