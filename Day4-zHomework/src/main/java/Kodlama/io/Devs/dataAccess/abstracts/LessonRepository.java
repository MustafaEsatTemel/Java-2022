package Kodlama.io.Devs.dataAccess.abstracts;

import java.util.List;

import Kodlama.io.Devs.entities.concretes.Lesson;

public interface LessonRepository {

	List<Lesson> getAll();
}
