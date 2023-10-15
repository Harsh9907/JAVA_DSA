public class _06_ArraySum {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        System.out.println(findSum(arr, arr.length));
    }

    public static int findSum(int[] arr, int n) {
        if (n <= 0)
            return 0;
        return (findSum(arr, n - 1) + arr[n - 1]);
    }
}
