package com.felipecarvalho.projectSpringMongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.felipecarvalho.projectSpringMongo.domain.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String>{
	
}
