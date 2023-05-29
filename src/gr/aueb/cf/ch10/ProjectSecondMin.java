package gr.aueb.cf.ch10;

/**
 *  Finds the second min value and position
 *  of an array of integers.
 */
public class ProjectSecondMin {

    public static void main(String[] args) {
        int[] arr = {0, 3, 8, 2, 12, 5};
        int secMinPos;
        int secMinValue;

        secMinPos = getSecondMinPosition(arr);
        secMinValue = arr[secMinPos];
        if(secMinPos == 1)
            System.exit(1);

        System.out.println("Position: " + " " + (secMinPos + 1) + " " + "Value: " + " " + secMinValue);
    }

    public static int getSecondMinPosition(int[] arr) {
        int minPos = 0;
        int secondMinPos = 0;
        int minValue = 0;
        int secondMinValue = 0;

        if (arr == null) return - 1;
        if (arr.length < 2) return - 1;

        minValue = arr[0];
        secondMinValue = arr[1];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minValue && arr[i] < secondMinValue) {
                secondMinPos = minPos;
                secondMinValue = minValue;
                minPos = i;
                minValue = arr[i];

            } else if (arr[i] > minValue && arr[i] < secondMinValue) {
                secondMinPos = i;
                secondMinValue = arr[i];
            }
        }
        return secondMinPos;
    }
}
