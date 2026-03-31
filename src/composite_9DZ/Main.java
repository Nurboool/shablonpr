package composite_9DZ;

public class Main {

    public static void main(String[] args) {

        File file1 = new File("file1.txt", 100);
        File file2 = new File("file2.txt", 200);

        Directory folder1 = new Directory("Folder1");
        Directory folder2 = new Directory("Folder2");

        folder1.add(file1);
        folder1.add(file2);

        folder2.add(new File("file3.txt", 300));

        folder1.add(folder2);

        folder1.display("");

        System.out.println("Total size: " + folder1.getSize());
    }
}