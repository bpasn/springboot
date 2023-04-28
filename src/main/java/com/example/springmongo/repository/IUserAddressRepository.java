package com.example.springmongo.repository;

import com.example.springmongo.models.UserAddress;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface IUserAddressRepository extends MongoRepository<UserAddress,String> {
}
