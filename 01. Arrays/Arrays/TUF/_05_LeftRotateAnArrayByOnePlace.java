import java.util.*;

public class _05_LeftRotateAnArrayByOnePlace {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        leftRotation(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void leftRotation(int[] arr) {
        int temp = arr[0];
        for (int i = 1; i < arr.length; i++) {
            arr[i - 1] = arr[i];
        }
        arr[arr.length - 1] = temp;
    }
}
