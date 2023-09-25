import java.util.Arrays;

public class _03_RunningSum1DArray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int[] result = runningSum(arr);
        System.out.print(Arrays.toString(result));
    }
    // Time Complexity = O(n)
    // Space Complexity = O(1)
    public static int[] runningSum(int[] arr) {
        // int sum = 0;
        int n = arr.length;
        int[] result = new int[n];

        // for (int i = 0; i < n; i++) {
        // sum = sum + arr[i];
        // result[i] = sum;
        // }
        // return result;

        // prefix sum approach, in this approach, we use previous arr element or result to get the current result.

        result[0] = arr[0];
        for (int i = 1; i < n; i++) {
            result[i] = result[i - 1] + arr[i];
        }
        return result;
    }
}