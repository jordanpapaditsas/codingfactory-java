package CodingFactory23A.src.gr.aueb.cf.ch11;

public class AccountApp {

    public static void main(String[] args) {
        gr.aueb.cf.ch11.Account alice = new gr.aueb.cf.ch11.Account(1, "GR12345", "Alice", "Wonderland", "F12345", 350.0);

        try {
            alice.deposit(100);
            System.out.println("Your deposit was successful!");
            System.out.println("Your new balance is: " + alice.getAccountBalance());

            alice.withdraw(50, "F12345");
            System.out.println("Your withdraw was successful!");

            System.out.println(alice.accountToString());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
