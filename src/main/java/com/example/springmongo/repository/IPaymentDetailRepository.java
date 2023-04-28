package com.example.springmongo.repository;

import com.example.springmongo.models.PaymentDetail;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface IPaymentDetailRepository extends MongoRepository<PaymentDetail,String> {
}
