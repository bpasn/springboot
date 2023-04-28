package com.example.springmongo.repository;

import com.example.springmongo.models.OrderDetail;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface IOrderDetailRepository extends MongoRepository<OrderDetail,String> {
}
