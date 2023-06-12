package CodingFactory23A.src.gr.aueb.cf.ch11;

public class DriverApp {

    public static void main(String[] args) {
        Teacher alice = new Teacher();
        alice.setId(1);
        alice.setFirstname("Alice");
        alice.setLastname("Wonderland");

        System.out.println("id: " + alice.getId());
        System.out.println("firstname: " + alice.getFirstname());
        System.out.println("lastname: " + alice.getLastname());
    }
}
