package gr.aueb.cf.ch4;

/**
 * Εκτυπώνει 10 γραμμής με 10 αστεράκια
 * σε κάθε γραμμή.
 */
public class Stars10x10App {

    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
