package homework.v3.business;

import homework.v3.dataAccess.IBaseDao;
import homework.v3.entities.Course;

import java.util.ArrayList;
import java.util.List;

public class CourseManager {
    public static List<String> courseNames = new ArrayList<>();
    private List<IBaseDao> iBaseDaos;

    public CourseManager(List<IBaseDao> iBaseDaos) {
        this.iBaseDaos = iBaseDaos;
    }

    public void add(Course course) throws Exception {
        if(!courseNames.contains(course.getCourseName())&&course.getCoursePrice()>0){
            courseNames.add(course.getCourseName());
            System.out.println("Added course : "+course.getCourseName());
            System.out.println("Instructor : "+course.getInstructor().getNameSurname());
            System.out.println("Category : "+course.getCategory().getCategoryName());

            for(IBaseDao x : iBaseDaos){
                x.add();
            }
        }else{
            throw new Exception("Check the price (>0) and course name must be not repeated");
        }
    }
}
