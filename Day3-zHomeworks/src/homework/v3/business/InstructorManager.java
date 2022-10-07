package homework.v3.business;

import homework.v3.entities.Instructor;

import java.util.ArrayList;
import java.util.List;

public class InstructorManager {
    public static List<String> instructorNames = new ArrayList<>();

    public InstructorManager() {
    }

    public void add(Instructor instructor){
        System.out.println("Instructor added : "+instructor.getNameSurname());
        instructorNames.add(instructor.getNameSurname());
    }

}
