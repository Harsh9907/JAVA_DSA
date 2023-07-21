import java.util.Arrays;

public class _04_ArraySumDecSize {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        sumArray(arr);
        // output=>
        // [48]
        // [20, 28]
        // [8, 12, 16]
        // [3, 5, 7, 9]
        // [1, 2, 3, 4, 5]
    }

    public static void sumArray(int[] arr) {
        if (arr.length == 0) {
            return;
        }
        int[] newArr = new int[arr.length - 1];
        for (int i = 0; i < newArr.length; i++) {
            newArr[i] = arr[i] + arr[i + 1];
        }
        sumArray(newArr);
        System.out.println(Arrays.toString(arr));
    }
}
