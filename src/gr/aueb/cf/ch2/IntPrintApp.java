package gr.aueb.cf.ch2;

public class IntPrintApp {

    public static void main(String[] args) {
        int i = 9;
        int j = 16;
        int k = 1991;

//        System.out.print(i);
//        System.out.println(i);
//        System.out.printf("%d", i);
//         System.out.print("Result = " + i);
//         System.out.println("Result = " + i);
//         System.out.printf("Result = %d%n", i);

         System.out.printf("%02d/%02d/%04d", i, j, k);
    }
}
