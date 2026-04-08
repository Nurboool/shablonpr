package university;

import java.util.ArrayList;
import java.util.List;

public class University {
    private String name;
    private String address;
    private List<Faculty> faculties = new ArrayList<>();

    public University(String name, String address) {
        this.name = name;
        this.address = address;
    }
}