package gr.aueb.cf.ch2;

/**
 * Typecast.
 */
public class TypecastApp {

    public static void main(String[] args) {
        int num1 = 10;
        long num2 = 20L;
        long result = 0L;

        num1 = (int) num2;

        result = num1 + num2;

    }
}
