package gr.aueb.cf.ch2;

import java.util.Scanner;

public class IntTwoDigitsApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0;
        int leftDigit = 0;
        int rightDigit = 0;
        int sum = 0;

        System.out.println("Please insert a num with two digits: ");
        num = in.nextInt();

        leftDigit = num / 10;
        rightDigit = num % 10;

        sum = leftDigit + rightDigit;

        System.out.printf("%d + %d = %d", leftDigit, rightDigit, sum);
    }
}
