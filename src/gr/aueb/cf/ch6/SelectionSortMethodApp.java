package gr.aueb.cf.ch6;

import java.util.Scanner;

/**
 *  Sorting an array from lowest to highest value
 *  with the method of Selection Sort.
 */
public class SelectionSortMethodApp {

    Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = {13, 6, 2, 32, 7, 5, 9};

        selectionSort(arr);
        for (int item : arr) {
            System.out.print(item + " ");
        }
    }

    public static void selectionSort(int[] arr) {
        // sorting the array with the call of getMinPosition method
        for (int i = 0; i <= arr.length - 1; i++) {
            getMinPosition(arr, i, arr.length - 1);
        }
    }

    public static int getMinPosition(int[] arr, int low, int high) {
        int position = low;
        if (arr == null || low < 0 || high > arr.length - 1) {
            return -1;
        }
        // searching and find the lowest value element position
        for (int i = low; i <= high; i++) {
            if (arr[i] < arr[position]) {
                position = i;
            }
        }
        // Swap method call
        swap(arr, low, position);
        return position;
    }

    public static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
