package university;

public class Main {
    public static void main(String[] args) {

        //  Университет
        University uni = new University("NU", "Astana");

        //  Факультет
        Faculty faculty = new Faculty("IT Faculty");

        //  Кафедра
        Department dept = new Department("Computer Science");

        //  Мұғалім
        Teacher teacher = new Teacher("Aidos", 1, "Professor");

        //  Студент
        Student student = new Student("Nurbek", 101, "S123");

        //  Курс
        Course course = new Course("Java Programming", dept);

        //  Расписание
        Schedule schedule = new Schedule();
        schedule.createSchedule();

        //  Байланыстарды орнату
        course.addStudent(student);          // студент курсқа қосылды
        student.registerCourse(course);      // студент тіркелді

        //  Экзамен және баға
        Exam exam = new Exam();
        Grade grade = new Grade(student, 90);

        teacher.assignGrade(student, grade);

        //  Студент бағасын көру
        student.viewGrades();

        // Админ
        Admin admin = new Admin("Admin", 999);
        admin.manageSystem();

        System.out.println("System working successfully ");
    }
}