package com.example.tutorialno2.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.tutorialno2.model.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
}
