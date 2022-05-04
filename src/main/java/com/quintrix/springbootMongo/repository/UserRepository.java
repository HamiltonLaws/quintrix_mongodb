package com.quintrix.springbootMongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.quintrix.springbootMongo.documents.User;

public interface UserRepository extends MongoRepository<User, Long> {

}
