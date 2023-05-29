package gr.aueb.cf.ch10;

/**
 *  Assume an array: {1, 2, 4, 4, 4, 6, 7, 8, 8, 8, 9, 9}.
 *  The app returns the low and high index for a key (integer key)
 *  that is included in the array. If the key was 8 the algorithm
 *  should return {7, 9}.
 */
public class ProjectLowAndHighIndexAppCh6 {

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 4, 4, 6, 7, 8, 8, 8, 9, 9};
        int key = 8;
        int[] result = getLowAndHighIndexOf(arr, key);

        if (result.length == 0) {
            System.out.println("Array is null.");
        } else {
            System.out.printf("Low Index: %d, High Index: %d\n", result[0], result[1]);
        }
    }

    public static int[] getLowAndHighIndexOf(int[] arr, int key) {
        int low = 0;
        int high = 0;
        int pivot;

        if (arr == null) return new int[] {};

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                low = i;
                break;
            }
        }
        high = low;
        pivot = low + 1;
        while (pivot < arr.length && arr[pivot++] == key) {
            high++;
        }
        return new int[] { low, high };
    }
}
