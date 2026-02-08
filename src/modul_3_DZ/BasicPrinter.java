package modul_3_DZ;

public class BasicPrinter implements Printer {

    @Override
    public void print(String content) {
        System.out.println("Printing: " + content);
    }
}
