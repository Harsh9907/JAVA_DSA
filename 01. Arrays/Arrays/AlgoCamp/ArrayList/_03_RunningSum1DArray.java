package ArrayList;

import java.util.Arrays;

public class _03_RunningSum1DArray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int[] result = runningSum(arr);
        System.out.print(Arrays.toString(result));
    }

    public static int[] runningSum(int[] arr) {
        int sum = 0, n = arr.length;
        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            sum = sum + arr[i];
            result[i] = sum;
        }
        return result;
    }
}