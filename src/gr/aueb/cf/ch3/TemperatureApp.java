package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Αποφασίζει αν χιονίζει με βάση τη
 * θερμοκρασία. Αν η θερμοκρασία είναι μικρότερη
 * απο 0 βαθμούς Κελσίου, τότε χιονίζει, αλλιώς
 * δε χιονίζει. Ο χρήστης δίνει τη θερμοκρασία.
 *
 */
public class TemperatureApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean isSnowing = false;
        int temp = 0;

        System.out.println("Please insert current Temperature: ");
        temp = in.nextInt();

        isSnowing = (temp < 0);

        System.out.println("Is snowing: " + isSnowing);
    }
}
