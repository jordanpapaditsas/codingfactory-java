package CodingFactory23A.src.gr.aueb.cf.ch11;

/**
 * Driver class.
 */
public class Main {

    public static <Student> void main(String[] args) {
        Student alice = new Student();
        Student bob = new Student(2, "Bob", "Dickinson");
        Student george = new Student(3, "George", "Jan");

        System.out.println(Student.getStudentsCount());

        //Set
        alice.setId(1);
        alice.setFirstname("Alice");
        alice.setLastname("Wonderland");

        bob.setId(3);

        // Get
        System.out.println("Id: " + alice.getId());
        System.out.println("Firstname: " + alice.getFirstname());
        System.out.println("Lastname: " + alice.getLastname());

        System.out.println();

        System.out.println("Bob Id: " + bob.getId());
        System.out.println("Bob Firstname: " + bob.getFirstname());
        System.out.println("Bob Lastname: " + bob.getLastname());

        System.out.println();

        System.out.println("George Id: " + george.getId());
        System.out.println("George Firstname: " + george.getFirstname());
        System.out.println("George Lastname: " + george.getLastname());
    }
}
