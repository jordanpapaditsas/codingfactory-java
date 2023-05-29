package gr.aueb.cf.ch7;

import java.util.Scanner;

public class StringInputApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s;

        System.out.println("Please provide a string: ");
//        s = in.next(); // ends with whitespace (space, \t, \n)
        s = in.nextLine(); // reads strings with spaces without changing line.

        System.out.println(s);
    }
}
