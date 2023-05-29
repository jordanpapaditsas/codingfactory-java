package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 *  Asks the user to give a number, then
 *  prints out stars ("*") according to
 *  the users input.
 */
public class StarsApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberOfStars = 0;
        int i = 0;

        System.out.println("Please insert number of stars: ");
        numberOfStars = in.nextInt();

        while (i <= numberOfStars) {
            System.out.print("*");
            i++;
            if (i % 50 == 0) {
                System.out.println();
            }
        }
    }
}
