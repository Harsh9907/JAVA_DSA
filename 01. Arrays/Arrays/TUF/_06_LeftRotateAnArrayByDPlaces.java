import java.util.*;

public class _06_LeftRotateAnArrayByDPlaces {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
        int d = 3;
        // leftRotationByDPlaces(arr, d);
        System.out.println(Arrays.toString(arr));
        leftRotationByDPlaces1(arr, d);
        System.out.println(Arrays.toString(arr));
    }

    // Time Complexity O(n)
    // Space Complexity O(1)

    public static void leftRotationByDPlaces1(int[] arr , int d){
        int n = arr.length;
        d = d % n;
        int[] temp = new int[d];
        
        for (int i = 0; i < d; i++) {
            temp[i] = arr[i];
        }
        for(int i = d; i<n;i++){
            arr[i-d] = arr[i];
        }
        for (int i = n-d; i < n; i++) {
            arr[i] = temp[i-(n-d)];
        }
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
