import java.util.*;

public class _07_MoveZeroesToEnd {
    public static void main(String[] args) {
        int[] arr = { 1, 0, 0, 0, 2, 3 };
        moveZeroesToEnd(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void moveZeroesToEnd(int[] arr) {
        int nonZeroPos = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                int temp = arr[nonZeroPos];
                arr[nonZeroPos] = arr[i];
                arr[i] = temp;
                nonZeroPos++;
            }
        }
    }
}
