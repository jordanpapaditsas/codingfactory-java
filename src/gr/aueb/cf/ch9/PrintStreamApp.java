package gr.aueb.cf.ch9;

import java.io.IOException;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

/**
 *  Prints with PrintStream.
 */
public class PrintStreamApp {

    public static void main(String[] args) {
        try (PrintStream ps = new PrintStream("C:/tmp/f23.txt", StandardCharsets.UTF_8)) {
            ps.println("Hello Coding Factory, Γεια!!!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
