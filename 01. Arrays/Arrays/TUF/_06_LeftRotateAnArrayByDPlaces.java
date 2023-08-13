import java.util.*;

public class _06_LeftRotateAnArrayByDPlaces {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
        int d = 8;
        leftRotationByDPlaces(arr, d);
        System.out.println(Arrays.toString(arr));
    }

    // Time Complexity O(n)
    // Space Complexity O(1)
    public static void leftRotationByDPlaces(int[] arr, int d) {
        int n = arr.length - 1;
        d = d % n;
        rev(arr, 0, d - 1);
        rev(arr, d, n);
        rev(arr, 0, n);
    }

    public static void rev(int[] arr, int start, int end) {
        while (start <= end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
