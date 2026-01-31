package modul_2_DZ;


public class Main {

    public static void main(String[] args) {

        // DRY
        Logger.log(Logger.LogLevel.INFO, "Application started");

        // KISS
        NumberProcessor processor = new NumberProcessor();
        processor.processNumbers(new int[]{-1, 3, 5, 0, 8});

        // YAGNI
        User user = new User("Nurbolat", "nurbolat@mail.com");
        System.out.println(user.getName());

        // Divide
        MathUtils math = new MathUtils();
        System.out.println(math.divide(10, 2));
        System.out.println(math.divide(10, 0));
    }
}
