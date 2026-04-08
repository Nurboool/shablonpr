package university;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private String name;
    private List<Teacher> teachers = new ArrayList<>();
    private List<Course> courses = new ArrayList<>();

    public Department(String name) {
        this.name = name;
    }
}