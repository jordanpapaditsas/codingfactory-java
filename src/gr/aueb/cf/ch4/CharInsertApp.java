package gr.aueb.cf.ch4;

import java.io.IOException;

public class CharInsertApp {

    public static void main(String[] args) throws IOException {
        char inputChar;

        System.out.println("Please insert an ASCII char: ");
        inputChar = (char) System.in.read();

        System.out.println("char: " + inputChar);
    }
}
