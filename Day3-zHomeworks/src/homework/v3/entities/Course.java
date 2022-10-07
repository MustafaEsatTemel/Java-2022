package homework.v3.entities;

public class Course<S, D extends Number> {
    private String courseName;
    private double coursePrice;
    private Instructor instructor;
    private Category category;

    public Course(String courseName, double coursePrice, Instructor instructor, Category category) {
        this.courseName = courseName;
        this.coursePrice = coursePrice;
        this.instructor = instructor;
        this.category = category;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public double getCoursePrice() {
        return coursePrice;
    }

    public void setCoursePrice(double coursePrice) {
        this.coursePrice = coursePrice;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
