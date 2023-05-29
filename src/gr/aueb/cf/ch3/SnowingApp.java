package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Αποφασίζει αν χιονίζει ή όχι
 * με βάση όχι μονό τη θερμοκρασία
 * αλλά και με το αν βρέχει.
 *
 */
public class SnowingApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean isSnowing = false;
        boolean isRaining = false;
        int temp = 0;

        System.out.println("Please insert if its raining (True / False): ");
        isRaining = in.nextBoolean();

        System.out.println("Please insert Temperature: ");
        temp = in.nextInt();

        isSnowing = isRaining && (temp < 0);

        System.out.println("Is snowing: " + isSnowing);
    }
}
