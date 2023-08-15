import java.util.Arrays;

public class _05_SwappingArray {
    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3, 4, 5 };
        int[] arr2 = { 6, 7, 8, 9, 10 };
        swapArray(arr1, arr2);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }

    public static void swapArray(int[] arr1, int[] arr2) {
        int[] temp = arr1;
        arr1 = arr2;
        arr2 = temp;
        arr1[0] = 29;
    }

    public static void swapHarsh(String[] args) {

    }
}
