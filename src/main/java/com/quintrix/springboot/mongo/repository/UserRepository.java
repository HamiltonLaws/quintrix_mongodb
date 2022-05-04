package com.quintrix.springboot.mongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.quintrix.springboot.mongo.documents.User;

public interface UserRepository extends MongoRepository<User, Long> {

}
