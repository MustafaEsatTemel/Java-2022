package Kodlama.io.Devs.entities.concretes;

public class Lesson {
	
	private int id;
	private String lessonName;
	
	public Lesson(int id, String lessonName) {
		super();
		this.id = id;
		this.lessonName = lessonName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLessonName() {
		return lessonName;
	}

	public void setLessonName(String lessonName) {
		this.lessonName = lessonName;
	}
	
	

	
	
}
