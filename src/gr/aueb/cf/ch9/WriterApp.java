package gr.aueb.cf.ch9;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.io.PrintWriter;


public class WriterApp {

    public static void main(String[] args) {
        try (PrintStream ps = new PrintStream("C:/tmp/test1.txt");
             PrintWriter pw = new PrintWriter("C:/tmp/test2.txt")) {
                 ps.println("Hello CF! from print stream");
                 pw.println("Hello CF! from print writer");
                 pw.flush(); // Writes on the file straight away without using buffer.
        } catch (FileNotFoundException e) {
            System.out.println("File path not found");
        }
    }
}
