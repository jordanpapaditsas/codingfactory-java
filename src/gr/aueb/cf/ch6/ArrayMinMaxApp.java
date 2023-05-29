package gr.aueb.cf.ch6;

/**
 * Searching for the minimum and the
 * maximum element in array table.
 */
public class ArrayMinMaxApp {

    public static void main(String[] args) {
        int[] arr = {30, 12, 80, 7, 15};

        int minPosition = 0;
        int minValue = arr[minPosition];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < minValue) {
                minPosition = i;
                minValue = arr[i];
            }
        }

        System.out.printf("Min Value: %d, Min Position %d\n", minValue, minPosition + 1);

        int maxPosition = 0;
        int maxValue = arr[maxPosition];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxValue) {
                maxPosition = i;
                maxValue = arr[i];
            }
        }
        System.out.printf("Max value: %d, Max Position: %d", maxValue, maxPosition + 1);
    }
}
