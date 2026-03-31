package composite_9DZ;

public class File extends FileSystemComponent {

    private int size;

    public File(String name, int size) {
        super(name);
        this.size = size;
    }

    public void display(String indent) {
        System.out.println(indent + "File: " + name + " (" + size + ")");
    }

    public int getSize() {
        return size;
    }
}