package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Μετατρέπει δευτερόλεπτα σε Days,
 * Hours, Minutes, Secs.
 */
public class SecondsDemo {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final int DAY_SECS = 24 * 3600;
        final int HOUR_SECS = 3600;
        final int MINUTE_SECS = 60;
        long remainingSeconds = 0;
        long inputSeconds = 0;
        long days = 0;
        long hours = 0;
        long minutes = 0;
        long seconds = 0;

        System.out.println("Please insert the total amount of seconds: ");
        inputSeconds = in.nextInt();

        remainingSeconds = inputSeconds;

        days = remainingSeconds / DAY_SECS;
        remainingSeconds = remainingSeconds % DAY_SECS;

        hours = remainingSeconds / HOUR_SECS;
        remainingSeconds = remainingSeconds % HOUR_SECS;

        minutes = remainingSeconds / MINUTE_SECS;
        remainingSeconds = remainingSeconds % MINUTE_SECS;

        System.out.printf("%,d input seconds = %d days, %d hours, %d minutes, %d seconds",
                inputSeconds, days, hours, minutes, remainingSeconds);

    }
}
