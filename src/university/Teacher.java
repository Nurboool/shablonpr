package university;

import java.util.ArrayList;
import java.util.List;

public class Teacher extends User {
    private String position;
    private List<Course> courses = new ArrayList<>();

    public Teacher(String name, int id, String position) {
        super(name, id);
        this.position = position;
    }

    public void assignGrade(Student student, Grade grade) {
        System.out.println("Grade assigned");
    }
}