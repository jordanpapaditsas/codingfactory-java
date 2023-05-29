package gr.aueb.cf.ch7;

import java.util.Scanner;

public class ForStringApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = "Coding Factory";

        String substring = s.substring(0, 6);

        System.out.println(substring);


        for (int i = 0; i < s.length(); i ++) {
            System.out.print(s.charAt(i) + " ");
        }
        System.out.println("\u2764");


        for (char ch: s.toCharArray()) {
            System.out.print(ch + " ");
        }
        System.out.println("\u2764");


        int index = s.indexOf("o", 7);
        int index2 = s.lastIndexOf("o");
        System.out.println(index);
        System.out.println(index2);
    }
}
