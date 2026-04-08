package university;

import java.util.ArrayList;
import java.util.List;

public class Faculty {
    private String name;
    private List<Department> departments = new ArrayList<>();

    public Faculty(String name) {
        this.name = name;
    }
}