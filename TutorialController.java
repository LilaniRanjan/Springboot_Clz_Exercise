package com.Lilaniya.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Lilaniya.demo.model.Tutorial;
import com.Lilaniya.demo.service.TutorialService;

@RestController
@RequestMapping("/api")
public class TutorialController {

	
	@Autowired
	TutorialService tutorialService;
	
	@GetMapping("/tutorials")
	public List<Tutorial> getAllTutorials() {
		return tutorialService.getAllTutorials();
	}
	
	@PostMapping("/tutorials")
	public Tutorial createTutorial(@RequestBody Tutorial tutorial) {
		return tutorialService.createTutorial(tutorial);
	}
	
	@GetMapping("/tutorials/{id}")
	public Optional<Tutorial> getTutorialById(@PathVariable String id) {
		return tutorialService.getTutorialById(id);
	}
	
	@PutMapping("/tutorials/{id}")
	public Tutorial updateTutorial(@RequestBody Tutorial tutorial, @PathVariable String id) {
		return tutorialService.updateTutorial(id, tutorial);
	}
	
	@DeleteMapping("/tutorials/{id}")
	public void deleteTutorial(@PathVariable String id) {
		tutorialService.deleteTutorial(id);
	}
	
	@DeleteMapping("/tutorials")
	public void deleteAll() {
		tutorialService.deleteAllTutorial();
	}
	
	@GetMapping("tutorials/published")
	public List<Tutorial> getTutorialsByPublished(){
		return tutorialService.getTutorialsByPublished();
	}
	
//	@GetMapping("/tutorials")
//	public List<Tutorial> getTutorialsByTitle(@RequestParam String title){
//		return tutorialService.getTutorialsByTitle(title);
//	}
}
