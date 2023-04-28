package com.example.springmongo.repository;

import com.example.springmongo.models.CartItem;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ICartItemRepository extends MongoRepository<CartItem,String> {
}
