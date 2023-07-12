package MileStone1.Arrays;
import java.util.Arrays;

public class _06SwapAlternate {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        swapAlternate(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void swapAlternate(int[] arr) {
        int n = arr.length-1;
        for(int i = 0; i < n-1; i+=2) {
            swap(arr, i, i+1);
        }
    }
    public static void swap(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
