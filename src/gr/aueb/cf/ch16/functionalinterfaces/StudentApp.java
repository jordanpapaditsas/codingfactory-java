package gr.aueb.cf.ch16.functionalinterfaces;

public class StudentApp {

    public static void main(String[] args) {
        Student[] students;
        students = new Student[] {
                new Student(1, "Alice", "W."), new Student(2, "Bob", "D."),
                new Student(3, "Chris", "A."), new Student(4, "Jack", "K.")
        };

        printStudents(students, new IDChecker() {
            @Override
            public boolean checkId(Student student) {
                return student.getId() >= 3;
            }
        });

        printStudents(students, (student) -> student.getId() <= 2);

    }

    public static void printStudents(Student[] students, IDChecker checker) {
        for (Student student : students) {
            if (checker.checkId(student)) {
                System.out.println(student);
            }
        }
    }
}
