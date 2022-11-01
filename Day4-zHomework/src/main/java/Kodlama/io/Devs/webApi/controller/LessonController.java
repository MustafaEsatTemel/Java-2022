package Kodlama.io.Devs.webApi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Kodlama.io.Devs.business.abstracts.LessonService;
import Kodlama.io.Devs.entities.concretes.Lesson;

@RestController
@RequestMapping("/api/lessons")
public class LessonController {

	private LessonService lessonService;

	@Autowired
	public LessonController(LessonService lessonService) {
		super();
		this.lessonService = lessonService;
	}
	
	@GetMapping("/getAll")
	public List<Lesson> getAll(){
		return lessonService.getAll();
	}
	
	@PostMapping("/add")
	public void add(Lesson lesson) {
		lessonService.add(lesson);
	}
	
	@PostMapping("/update")
	public void update(int index,Lesson newLesson) {
		lessonService.update(index, newLesson);
	}
	
	@DeleteMapping("/delete")
	public void delete(int index) {
		lessonService.delete(index);
	}
	
	@GetMapping("/getAll{id}")
	public Lesson getLessonById(int index) {
		return lessonService.getLessonById(index);
	}
	
	
	
}
