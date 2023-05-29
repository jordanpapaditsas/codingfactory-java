package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Ζητάει απο τον χρήστη τρεις ακεραίους,
 * τους μειώνει κατά μια μονάδα και τους
 * εμφανίζει με την ίδια σειρά που δόθηκαν
 * αφήνοντας ενα κενό ανάμεσα τους.
 */
public class ThreeNumbersApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;

        System.out.println("Please insert 3 integers");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        num3 = scanner.nextInt();

        // num1 = num1 - 1;
        // num1 -= 1;
        num1--;
        num2--;
        num3--;

        System.out.printf("%d %d %d", num1, num2, num3);
    }
}
