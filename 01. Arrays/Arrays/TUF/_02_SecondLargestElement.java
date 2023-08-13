import java.util.Arrays;

public class _02_SecondLargestElement {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        System.out.println("The Second Largest element present : " + secondLargest(arr));
    }

    // Time Complexity = O(nlogn)
    // Space Complexity = O(1)
    public static int secondLargest(int[] arr) {
        int secondLargest = Integer.MIN_VALUE;

        // If array does not contain any duplicate elements
        Arrays.sort(arr);
        secondLargest = arr[arr.length - 2];
        return secondLargest;
    }
}
