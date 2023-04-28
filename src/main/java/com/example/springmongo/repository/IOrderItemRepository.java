package com.example.springmongo.repository;

import com.example.springmongo.models.OrderItem;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface IOrderItemRepository extends MongoRepository<OrderItem,String> {
}
