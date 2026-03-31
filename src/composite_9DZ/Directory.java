package composite_9DZ;

import java.util.ArrayList;
import java.util.List;

public class Directory extends FileSystemComponent {

    private List<FileSystemComponent> children = new ArrayList<>();

    public Directory(String name) {
        super(name);
    }

    public void add(FileSystemComponent component) {

        if (!children.contains(component)) {
            children.add(component);
        } else {
            System.out.println("Component already exists");
        }
    }

    public void remove(FileSystemComponent component) {

        if (children.contains(component)) {
            children.remove(component);
        } else {
            System.out.println("Component not found");
        }
    }

    public void display(String indent) {

        System.out.println(indent + "Directory: " + name);

        for (FileSystemComponent comp : children) {
            comp.display(indent + "   ");
        }
    }

    public int getSize() {

        int total = 0;

        for (FileSystemComponent comp : children) {
            total += comp.getSize();
        }

        return total;
    }
}