package gr.aueb.cf.ch1;

/**
 * Προσθέτει 2 ακεραίους
 * και εμφανίζει το αποτέλεσμα
 * στο stdout.
 */
public class AddApp {

    public static void main(String[] args) {

        // Δήλωση και αρχικοποίηση μεταβλητών
        int num1 = 10;
        int num2 = 7;
        int result = 0;


        // Εντολές
        result = num1 + num2;

        // Εκτύπωση αποτελεσμάτων
        System.out.printf("Το αποτέλεσμα είναι: " + result);
    }
}

