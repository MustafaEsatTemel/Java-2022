package homework.v3;

import homework.v3.business.CategoryManager;
import homework.v3.business.CourseManager;
import homework.v3.business.InstructorManager;
import homework.v3.dataAccess.HibernateDao;
import homework.v3.dataAccess.IBaseDao;
import homework.v3.dataAccess.JdbcDao;
import homework.v3.entities.Category;
import homework.v3.entities.Course;
import homework.v3.entities.Instructor;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args)  {
        InstructorManager instructorManager = new InstructorManager();
        instructorManager.add(new Instructor("Mustafa","esattemel130@gmail.com"));

        CategoryManager categoryManager = new CategoryManager();
        try {
            categoryManager.add(new Category("Yazilim"));
            categoryManager.add(new Category("English"));
            categoryManager.add(new Category("Yazilim"));
        } catch (Exception e) {
            e.printStackTrace();
        }


        System.out.println("----------------COURSE--------------");

        Instructor instructor = new Instructor("Mustafa Esat Temel","e@gmail.com");
        Category category = new Category("Bilgisayar");
        Course course = new Course("Python",55,instructor,category);
        CourseManager courseManager = new CourseManager(new ArrayList<IBaseDao>(Arrays.asList(new JdbcDao(),new HibernateDao())));
        try {
            courseManager.add(course);
            System.out.println("----");
            courseManager.add(new Course
                    ("Java",25,new Instructor("Kemal","sd@gmail.com"),new Category("Bilgisayar")));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
