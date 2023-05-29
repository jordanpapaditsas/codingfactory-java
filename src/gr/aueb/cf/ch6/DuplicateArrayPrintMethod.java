package gr.aueb.cf.ch6;

import java.util.Arrays;

/**
 *  Demonstrates a program that is searching for
 *  any duplicate values inside an array and prints them
 *  out.
 */
public class DuplicateArrayPrintMethod {

    public static void main(String[] args) {
        int[] arr = {15, 30, 10, 10, 22, 23, 32, 15, 19, 30, 30, 22, 23, 17, 67, 54};
        int[] duplicates = findDuplicates(arr);
        for (int i = 0; i < duplicates.length; i++) {
            System.out.print(duplicates[i] + " ");
        }
    }

    public static int[] findDuplicates(int[] arr) {
        int n = arr.length;
        int[] duplicates = new int[n];
        int index = 0;
        for (int i = 0; i < n; i++) {
            int current = arr[i];
            for (int j = i + 1; j < n; j++) {
                if (current == arr[j]) {
                    if (!contains(duplicates, current)) {
                        duplicates[index] = current;
                        index++;
                    }
                }
            }
        }
        return Arrays.copyOfRange(duplicates, 0, index);
    }

    public static boolean contains(int[] arr, int value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                return true;
            }
        }
        return false;
    }
}