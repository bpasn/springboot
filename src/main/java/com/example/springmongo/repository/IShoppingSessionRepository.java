package com.example.springmongo.repository;

import com.example.springmongo.models.ShoppingSession;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface IShoppingSessionRepository extends MongoRepository<ShoppingSession,String> {
}
