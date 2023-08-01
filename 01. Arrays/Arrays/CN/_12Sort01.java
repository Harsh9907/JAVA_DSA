import java.util.Arrays;

public class _12Sort01 {
    public static void main(String[] args) {
        int[] arr = { 1, 0, 1, 0, 0, 1, 0 };
        arr = sort01(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] sort01(int[] arr) {
        int nextZeroPos = 0;
        for (int current = 0; current < arr.length; current++) {
            if (arr[current] == 0) {
                int temp = arr[current];
                arr[current] = arr[nextZeroPos];
                arr[nextZeroPos] = temp;
                nextZeroPos++;
            }
        }
        return arr;
    }
}
