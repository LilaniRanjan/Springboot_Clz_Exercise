package com.Lilaniya.demo.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.Lilaniya.demo.model.Tutorial;

@Repository
public interface TutorialRepository extends MongoRepository<Tutorial, String> {
	
	List<Tutorial> findByPublished (boolean published);
	
	List<Tutorial> findByTitle (String title);

}
