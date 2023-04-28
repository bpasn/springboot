package com.example.springmongo.repository;

import com.example.springmongo.models.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface IProductRepository extends MongoRepository<Product,String> {
}
