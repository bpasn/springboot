package com.example.springmongo.repository;

import com.example.springmongo.models.UserPayment;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface IUserPaymentRepository extends MongoRepository<UserPayment,String> {
}
