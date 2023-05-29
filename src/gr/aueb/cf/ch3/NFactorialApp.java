package gr.aueb.cf.ch3;

/**
 * Get 'n' factorial of an int.
 */
public class NFactorialApp {

    public static void main(String[] args) {
        int n = 4;
        int factorial = 1;
        int i = 1;

        while (i <= n) {
            factorial = factorial * i;
            i++;
        }

        System.out.println("το 4! ειναι: " + factorial);
    }
}
