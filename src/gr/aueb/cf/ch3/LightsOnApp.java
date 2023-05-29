package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 *
 * Αποφασίζει αν πρέπει να ανάψουν τα φωτά ενός
 * αυτοκινήτου με βάση τρεις μεταβλητές :
 * αν βρέχει ΚΑΙ ταυτόχρονα ισχύει ενα απο τα
 * επόμενα: είναι σκοτίδι Η' τρέχουμε
 * (speed > 100). Τις τιμές αυτές τις λαμβάνουμε
 * απο το χρηστή.
 */
public class LightsOnApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean isRaining = false;
        boolean isDark = false;
        boolean isRunning = false;
        int speed = 0;
        boolean lightsOn = false;

        System.out.println("Please insert if its raining (true/false): ");
        isRaining = in.nextBoolean();

        System.out.println("Please insert if it is dark (true/false): ");
        isDark = in.nextBoolean();

        System.out.println("Please insert car speed: ");
        speed = in.nextInt();

        isRunning = (speed > 100);
        lightsOn = isRaining && (isDark || isRunning);

        System.out.println("Lights On: " + lightsOn);
    }
}
