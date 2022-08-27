package com.example.springapi.models.entities;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author Novin on 27/08/2022
 * @project springapi
 */
@Entity
@Table(name = "tbl_product")
public class Product implements Serializable {

    private static final long serialVersionID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "product_name", length = 100)
    private String name;

    @Column(name = "product_description", length = 500)
    private String description;

    @Column(name = "product_price")
    private double price;

    public Product() {
    }

    public Product(long id, String name, String description, double price) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
