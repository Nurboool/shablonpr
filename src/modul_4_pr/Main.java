package modul_4_pr;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter document type (report, resume, letter, invoice): ");
        String type = scanner.nextLine();

        try {
            DocumentCreator creator = DocumentFactory.getCreator(type);
            creator.openDocument();
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid document type!");
        }

        scanner.close();
    }
}
