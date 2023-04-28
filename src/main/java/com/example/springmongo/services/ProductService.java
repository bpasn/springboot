package com.example.springmongo.services;

import com.example.springmongo.models.Product;
import com.example.springmongo.repository.IProductRepository;
import com.mongodb.MongoException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    private IProductRepository productRepository;

    public List<Product> getProduct(){

        return productRepository.findAll();
    }

    public Optional<Product> getProductById(String id) {
        return productRepository.findById(id);
    }

    public String createProduct(Product product){
        productRepository.save(product);
        return "Create product successfully";
    }
}
