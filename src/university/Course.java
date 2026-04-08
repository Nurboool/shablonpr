package university;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private String name;
    private Department department;
    private List<Student> students = new ArrayList<>();

    public Course(String name, Department department) {
        this.name = name;
        this.department = department;
    }

    public void addStudent(Student student) {
        students.add(student);
    }
}