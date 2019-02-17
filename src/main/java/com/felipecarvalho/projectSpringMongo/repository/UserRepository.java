package com.felipecarvalho.projectSpringMongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.felipecarvalho.projectSpringMongo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String>{
	
}
