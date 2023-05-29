package gr.aueb.cf.ch6;

/**
 * Binary search.
 * For a binary search to work, the array needs to be
 * sorted.
 */
public class BinarySearchApp {

    public static void main(String[] args) {
        final int KEY = 1;
        int [] arr = {1, 5, 7, 8, 9, 12};
        int low = 0;
        int high = arr.length - 1;
        int position;

        position = binarySearch(arr, KEY, low, high);

        System.out.printf("Position: %d, Value: %d", (position + 1), arr[position]);
    }
    /**
     *  Returns the position of a certain value within an array.
     *
     * @param arr       the array to search
     * @param value     the value to find.
     * @param low       start index.
     * @param high      end index.
     * @return          the position of the value within array,
     *                  -1 otherwise.
     * */
    public static int binarySearch(int[] arr, int value, int low, int high) {
        int median;  // Position.

        if (arr == null) return - 1;
        if ((low < 0) || (high > arr.length - 1 )) return -1;
        if (high < low) return -1;

        median = (low + high) / 2;

        if(value == arr[median]) {
            return median;
        }
        if (value < arr[median]) {
            return binarySearch(arr, value, low, median -1);
        } else {
            return binarySearch(arr, value, median + 1, high);
        }
    }
}
