package Kodlama.io.Devs.business.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Kodlama.io.Devs.business.abstracts.LessonService;
import Kodlama.io.Devs.dataAccess.abstracts.LessonRepository;
import Kodlama.io.Devs.entities.concretes.Lesson;

@Service
public class LessonManager implements LessonService{
	
	private LessonRepository lessonRepository;
	private List<String> lessonNames;
	
	
	@Autowired
	public LessonManager(LessonRepository lessonRepository) {
		super();
		this.lessonRepository = lessonRepository;
		lessonNames = new ArrayList<String>();
		lessonNames.add("Java");
		lessonNames.add("C");
	}

	@Override
	public List<Lesson> getAll() {
		// TODO Auto-generated method stub
		return lessonRepository.getAll();
	}

	@Override
	public void add(Lesson lesson) {
		if(!(lessonNames.contains(lesson.getLessonName())) && !(lessonRepository.getAll().contains(lesson))&& lesson.getLessonName().length()>=1 ) {
			lessonRepository.getAll().add(lesson);
			lessonNames.add(lesson.getLessonName());
		}
		
	}

	@Override
	public void delete(int index) {
		lessonRepository.getAll().remove(index);
		
	}
	

	@Override
	public void update(int index,Lesson lesson) {
		lessonRepository.getAll().set(index, lesson);
		if(!lessonNames.contains(lesson.getLessonName())) {
			lessonNames.add(lesson.getLessonName());
		}
	}

	@Override
	public Lesson getLessonById(int id) {
		return lessonRepository.getAll().get(id);
	}



}
