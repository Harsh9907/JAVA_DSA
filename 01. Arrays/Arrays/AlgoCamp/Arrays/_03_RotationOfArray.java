import java.util.Arrays;

public class _03_RotationOfArray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        rotateArray(arr, -1);
        System.out.println(Arrays.toString(arr));
    }

    public static void rotateArray(int[] arr, int k) {
        int n = arr.length;
        if (k < 0) {
            k = k + n;
        }
        k = k % n;
        for (int i = 0; i < k; i++) {
            int temp = arr[n - 1];
            for (int j = n - 1; j > 0; j--) {
                arr[j] = arr[j - 1];
            }
            arr[0] = temp;
        }
    }
}
