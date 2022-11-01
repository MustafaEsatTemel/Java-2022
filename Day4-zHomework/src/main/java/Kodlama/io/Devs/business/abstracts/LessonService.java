package Kodlama.io.Devs.business.abstracts;

import java.util.List;

import Kodlama.io.Devs.entities.concretes.Lesson;

public interface LessonService {

	List<Lesson> getAll();
	void add(Lesson lesson);
	void delete(int index);
	void update(int index,Lesson newLesson);
	Lesson getLessonById(int id);
}
