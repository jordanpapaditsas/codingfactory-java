package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Ενα αεροσκάφος έχει δυο δεξαμενές
 * Αν μια δεξαμενή έχει λιγότερο απο
 * 1/4 καύσιμα τότε ανάβει πορτοκαλί άσημα,
 * ενω αν και οι δυο δεξαμενές έχουνε λιγότερο
 * απο 1/4 τότε ανάβει κόκκινο άσημα.
 * Ο πιλοτές (χρηστής) δίνει true η false
 * ανάλογα αν tank < 1/4 H oxi , αντίστοιχα.
 */
public class OrangeRedSignalApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean isTank1LessThanQuarter = false;
        boolean isTank2lessThanQuarter = false;
        boolean orangeOn = false;
        boolean redOn = false;

        System.out.println("Please insert if tank1, tank2 are less than 1/4: ");
        isTank1LessThanQuarter = in.nextBoolean();
        isTank2lessThanQuarter = in.nextBoolean();

        orangeOn = isTank1LessThanQuarter || isTank2lessThanQuarter;
        redOn = isTank1LessThanQuarter && isTank2lessThanQuarter;

        System.out.println("Orange on: " + orangeOn);
        System.out.println("Red on: " + redOn);
    }
}
