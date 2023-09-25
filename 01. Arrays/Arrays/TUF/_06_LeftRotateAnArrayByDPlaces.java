import java.util.*;

public class _06_LeftRotateAnArrayByDPlaces {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
        int d = 2;
        // int[] resultLeftRotate= leftRotationByDPlaces(arr, d);
        // System.out.println(Arrays.toString(resultLeftRotate));
        // leftRotationByDPlaces1(arr, d);
        System.out.println(Arrays.toString(arr));
        int[] resultRightRotate = rightRotationByDPlaces(arr, d);
        System.out.println(Arrays.toString(resultRightRotate));
    }

    // Time Complexity O(n+d)
    // Space Complexity O(d)

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
    public static int[] leftRotationByDPlaces(int[] arr, int d) {
        int[] arr1 = arr;
        int n = arr.length - 1;
        d = d % n;
        rev(arr1, 0, d - 1);
        rev(arr1, d, n);
        rev(arr1, 0, n);
        return arr1;
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

    public static int[] rightRotationByDPlaces(int[] arr, int d) {
        int[] arr1 = arr;
        int n = arr.length - 1;
        d = d % n;
        rev(arr1, n-d+1, n);
        rev(arr1, 0, n-d);
        rev(arr1, 0, n);
        return arr1;
    }
}
