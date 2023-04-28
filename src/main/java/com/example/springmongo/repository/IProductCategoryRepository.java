package com.example.springmongo.repository;

import com.example.springmongo.models.ProductCategory;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface IProductCategoryRepository extends MongoRepository<ProductCategory,String> {
}
