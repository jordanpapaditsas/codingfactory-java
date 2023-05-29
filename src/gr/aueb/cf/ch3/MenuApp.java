package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Εκτυπώνει menu επιλογέων επαναληπτικά
 * μέχρι ο χρηστής να επιλέξει έξοδο.
 */
public class MenuApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice = 0;

        do {
            System.out.println("Επιλέξτε ένα από τα παρακάτω: ");
            System.out.println("1. Εισαγωγή προιόντος");
            System.out.println("2. Διαγραφή προιόντος");
            System.out.println("3. Εξοδος");
            choice = in.nextInt();
        } while (choice != 3);
    }
}
