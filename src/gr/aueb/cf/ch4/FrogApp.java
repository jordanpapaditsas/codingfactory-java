package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 Ένας μικρός Βάτραχος θέλει να περάσει ένα ποτάμι
 ο Frog βρίσκεται στη θέση 'Χ'
 και θέλει να φτάσει στη θέση 'Υ'
 ή σε θέση μεγαλύτερη από το 'Υ'.
 Ο Frog κάνει jump σε fixed distance 'D'.

 Βρίσκει τον ελάχιστο αριθμό jumps που ο Frog
 πρέπει να κάνει, ώστε να φτάσει στον στόχο του ή
 να τον ξεπεράσει.

 Π.χ
 X = 10
 Y = 85
 D = 30

 Τότε ο Frog θα χρειαστεί 3 jumps
 γιατί θα ξεκινήσει απο το 10 και
 μετά το πρώτο jump θα παει
 στη θέση 10 + 30 = 40, στο
 δεύτερο jump πάει 40 + 30 = 70
 και στο 3o jump θα πάει 70 + 30 = 100.
 */
public class FrogApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int startPoint;
        int endPoint;
        int jumpDistance;
        int countJumps = 0;

        System.out.println("Please give us: start point, end point, jumps: ");
        startPoint = in.nextInt();
        endPoint = in.nextInt();
        jumpDistance = in.nextInt();

        for (int i = startPoint; i <= endPoint; i = i + jumpDistance) {
            countJumps++;
        }
        System.out.printf("Start Point: %d End Point: %d Jump Distance: %d, countJumps = %d",
                startPoint, endPoint, jumpDistance, countJumps);
    }
}
