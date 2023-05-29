package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * Λαμβάνει ένα grade απο τον χρήστη
 * και δίνει feedback (Excellent, V.good, good, Fail)
 * αν είναι grade >=9, >=7, >=5, αντίστοιχα.
 */
public class SwitchFallThroughApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int grade;

        System.out.println("Please provide the grade: ");
        grade = in.nextInt();

        switch (grade) {
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("Fail");
                break;
            case 5:
            case 6:
                System.out.println("Good");
                break;
            case 7:
            case 8:
                System.out.println("Very Good");
                break;
            case 9:
            case 10:
                System.out.println("Excellent");
                break;
            default:
                System.out.println("Error in grade");
                break;
        }
    }
}
