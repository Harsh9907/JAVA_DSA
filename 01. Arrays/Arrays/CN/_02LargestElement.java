public class _02LargestElement {
    public static void main(String[] args) {
        int[] arr = { 11, 2, 3, 4, 5 };
        System.out.print(largestElement(arr));
    }

    public static int largestElement(int[] arr) {
        int n = arr.length;
        int max = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
