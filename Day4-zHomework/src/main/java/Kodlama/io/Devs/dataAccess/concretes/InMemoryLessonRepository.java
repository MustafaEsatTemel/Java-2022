package Kodlama.io.Devs.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import Kodlama.io.Devs.dataAccess.abstracts.LessonRepository;
import Kodlama.io.Devs.entities.concretes.Lesson;

@Repository
public class InMemoryLessonRepository implements LessonRepository{

	private List<Lesson> lessons;
	
	public InMemoryLessonRepository() {
		lessons=new ArrayList<Lesson>();
		lessons.add(new Lesson(0, "C"));
		lessons.add(new Lesson(1, "Java"));

	}
	
	
	@Override
	public List<Lesson> getAll() {
		
		return lessons;
	}


}
