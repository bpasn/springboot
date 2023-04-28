package com.example.springmongo.repository;

import com.example.springmongo.models.Discount;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface IDiscountRepository extends MongoRepository<Discount,String> {
}
