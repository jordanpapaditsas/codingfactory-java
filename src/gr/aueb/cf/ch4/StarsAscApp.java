package gr.aueb.cf.ch4;

import java.util.Scanner;

public class StarsAscApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int height = 0;

        System.out.println("Type here: ");
        height = in.nextInt();

        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
