package com.Lilaniya.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Lilaniya.demo.model.Tutorial;
import com.Lilaniya.demo.repository.TutorialRepository;

@Service
public class TutorialService {
	
	@Autowired
	TutorialRepository tutorialRepository;

	public List<Tutorial> getAllTutorials() {
		return tutorialRepository.findAll();
				
	}
	
	public Tutorial createTutorial(Tutorial tutorial) {
		return tutorialRepository.insert(tutorial);
	}


	public Optional<Tutorial> getTutorialById(String id) {
		return tutorialRepository.findById(id) ;
	}

	public Tutorial updateTutorial(String id, Tutorial newtutorial) {
		Optional<Tutorial> oldTutorial= tutorialRepository.findById(id);
		if(oldTutorial.isPresent()) {
			Tutorial _tutorial= oldTutorial.get();
			_tutorial.setTitle(newtutorial.getTitle());
			_tutorial.setDescription(newtutorial.getDescription());
			_tutorial.setPublished(newtutorial.getPublished());
			
			return tutorialRepository.save(_tutorial);
		}
		return null;
	}

	public void deleteTutorial(String id) {
		tutorialRepository.deleteById(id); 
	}
	
	public void deleteAllTutorial() {
		tutorialRepository.deleteAll(); 
	}


	public List<Tutorial> getTutorialsByPublished() {
		return tutorialRepository.findByPublished(true);
	}

	public List<Tutorial> getTutorialsByTitle(String title) {
		return tutorialRepository.findByTitle(title);
	}


	
	
	

}
