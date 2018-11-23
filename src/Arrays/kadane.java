package Arrays;

import java.util.Arrays;

public class kadane {

    public static int maxSumInArray(int[] arr) {
        //Kadane's Algorithm
        int max = 0;
        int temp = 0;

        for (int i = 0; i < arr.length; i++) {
            temp = temp + arr[i];
            temp = Math.max(temp, 0);

            max = Math.max(temp, max);
        }
        return max;
    }
}
