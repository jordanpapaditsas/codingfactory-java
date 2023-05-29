package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Υπολογίζει το άθροισμα και μετά
 * το γινόμενο των 10 πρώτων αριθμόν.
 * (ακεραίων).
 */
public class SumAndMul10App {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = 0;
        int mul = 1;
        int i = 1;

        while (i <= 10) {
            sum = sum + i;
            mul = mul * i;
            i++;
        }
        System.out.println("Sum: " + sum);
        System.out.println("Mul: " + mul);
    }
}
