import java.util.Arrays;

public class _02_SecondLargestElement {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        System.out.println("The Second Largest element present : " + secondLargest(arr));
        System.out.println("The Second Largest element present : " + secondLargest1(arr));
        System.out.println("The Second Largest element present : " + secondLargest2(arr));
        System.out.println("The Second Largest element present : " + secondLargest3(arr));
    }

    // Time Complexity = O(nlogn)
    // Space Complexity = O(1)

    // If array does not contain any duplicate elements
    public static int secondLargest(int[] arr) {
        int secondLargest = Integer.MIN_VALUE;
        Arrays.sort(arr);
        secondLargest = arr[arr.length - 2];
        return secondLargest;
    }

    // Time Complexity = O(nlogn + n)
    // Space Complexity = O(1)

    // If array does contain duplicate elements
    public static int secondLargest1(int[] arr) {
        int secondLargest = Integer.MIN_VALUE;

        Arrays.sort(arr);
        int n = arr.length;
        int largest = arr[n-1];

        for (int i = n-2; i >= 0; i--) {
            if(arr[i] != largest){
                return arr[i];
            }
        }
        return secondLargest;
    }

    // Time Complexity = O(n + n)
    // Space Complexity = O(1)

    // here algo goes two times arrays traversal

    public static int secondLargest2(int[] arr){
        int largest = -1;
        int secondLargest = -1;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > largest){
                largest = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > secondLargest && arr[i] != largest){
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }

    // Time Complexity = O(n) Optimized Solution
    // Space Complexity = O(1)

    // here algo goes two times arrays traversal

    public static int secondLargest3(int[] arr){
        int largest = -1;
        int secondLargest = -1;

        for (int i = 0; i < arr.length; i++) {
           if(arr[i] > largest){
               secondLargest = largest;
               largest = arr[i];
           }else if(arr[i] > secondLargest && arr[i] != largest){
                secondLargest = arr[i];
           }
        }
        return secondLargest;
    }
}
