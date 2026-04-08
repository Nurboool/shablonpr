package university;

import java.util.ArrayList;
import java.util.List;

public class Student extends User {
    private String studentId;
    private List<Course> courses = new ArrayList<>();

    public Student(String name, int id, String studentId) {
        super(name, id);
        this.studentId = studentId;
    }

    public void registerCourse(Course course) {
        courses.add(course);
    }

    public void viewGrades() {
        System.out.println("Viewing grades...");
    }
}