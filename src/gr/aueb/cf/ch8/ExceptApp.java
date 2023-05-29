package gr.aueb.cf.ch8;

import java.io.IOException;

/**
 * Demonstrates the usage of Exceptions.
 */
public class ExceptApp {

    public static void main(String[] args) throws IOException {
        int ch = System.in.read();

        try {
            ch = System.in.read();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static int getNextChar() {
        int ch = ' ';

        try {
            ch = System.in.read();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return ch;
    }
}
