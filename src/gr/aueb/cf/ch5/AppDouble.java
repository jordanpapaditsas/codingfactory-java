package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * Λαμβάνει 3 άτιμες απο τον
 * χρηστή τις a, b, c οπού η
 * a είναι η υποτείνουσα και
 * b, c οι δυο πλευρές.
 * Ελέγχει αν το τρίγωνο είναι
 * ορθογώνιο , δηλαδή a^2 == b^2 + c^2
 */
public class AppDouble {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final double EPSILON = 0.000005;
        double a;
        double b;
        double c;

        System.out.println("Δώστε a, b, c: ");
        a = in.nextDouble();
        b = in.nextDouble();
        c = in.nextDouble();

        if (Math.abs(a*a - (b*b + c*c)) <= EPSILON) {
            System.out.println("Το τρίγωνο είναι ορθογώνιο");
        } else {
            System.out.println("Το τρίγωνο δεν είναι ορθογώνιο");
        }
    }
}
