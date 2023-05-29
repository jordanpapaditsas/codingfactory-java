package gr.aueb.cf.ch5;

/**
 * Ελέγχει ισότητα / ανισότητα στους
 * floating points.
 */
public class DoubleCompareApp {

    public static void main(String[] args) {
        double d1 = 10.542;
        double d2 = 10.543;
        final double EPSILON = 0.005;

        if (Math.abs(d2-d1) <= EPSILON) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }
    }
}
