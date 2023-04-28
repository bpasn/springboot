package com.example.springmongo.repository;

import com.example.springmongo.models.ProductInventory;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface IProductInventoryRepository extends MongoRepository<ProductInventory,String> {
}
