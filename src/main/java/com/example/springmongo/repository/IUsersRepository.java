package com.example.springmongo.repository;

import com.example.springmongo.models.Users;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface IUsersRepository extends MongoRepository<Users,String> {
}
