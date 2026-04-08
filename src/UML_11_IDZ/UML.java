package UML_11_IDZ;

import university.*;
import banking.*;

public class UML {
    public static void main(String[] args) {

        System.out.println("========= UNIVERSITY SYSTEM =========");

        // 🎓 Университет жүйесі
        University uni = new University("KazNU", "Almaty");
        Faculty faculty = new Faculty("IT Faculty");
        Department dept = new Department("Computer Science");

        Teacher teacher = new Teacher("Aidos", 1, "Professor");
        Student student = new Student("Nurbek", 101, "S123");

        Course course = new Course("Java Programming", dept);

        // байланыстар
        course.addStudent(student);
        student.registerCourse(course);

        // экзамен
        Grade grade = new Grade(student, 95);
        teacher.assignGrade(student, grade);

        student.viewGrades();

        Admin admin = new Admin("Admin", 999);
        admin.manageSystem();


        System.out.println("\n========= BANKING SYSTEM =========");

        // 🏦 Банкинг жүйесі
        Frontend frontend = new Frontend();
        Backend backend = new Backend();
        Database database = new Database();
        AuthService authService = new AuthService();
        PaymentGateway paymentGateway = new PaymentGateway();
        NotificationService notificationService = new NotificationService();
        AnalyticsModule analytics = new AnalyticsModule();
        MonitoringSystem monitoring = new MonitoringSystem();

        // 🔐 Login
        frontend.sendRequest();
        boolean isAuth = authService.login("user", "1234");

        if (isAuth) {
            System.out.println("Login successful ✅");

            backend.processRequest();
            paymentGateway.processPayment();
            database.saveData();
            notificationService.sendNotification();
            analytics.generateReport();
        }

        monitoring.monitor();

        System.out.println("\n========= SYSTEM FINISHED ========= 🚀");
    }
}