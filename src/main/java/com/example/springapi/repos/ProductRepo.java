package com.example.springapi.repos;

import com.example.springapi.models.entities.Product;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * @author Novin on 27/08/2022
 * @project springapi
 */
public interface ProductRepo extends CrudRepository<Product, Long> {
    List<Product> findByNameContains(String name);
}
