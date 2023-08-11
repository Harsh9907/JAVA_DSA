import java.util.Arrays;

public class _01_LargestElement {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 60 };
        System.out.println(largestElement(arr));
    }

    // Time Complexity = O(nlogn);
    // Space Complexity = O(1);
    public static int largestElement1(int[] arr) {
        Arrays.sort(arr);
        return arr[arr.length - 1];
    }

    // Time Complexity = O(n);
    // Space Complexity = O(1);
    public static int largestElement(int[] arr) {
        int n = arr.length, max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}