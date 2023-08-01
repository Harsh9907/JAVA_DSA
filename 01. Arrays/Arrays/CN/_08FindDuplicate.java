public class _08FindDuplicate {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 6 };
        System.out.println("Duplicate Element present in array : " + findDuplicate(arr));
    }

    public static int findDuplicate(int[] arr) {
        int n = arr.length - 1;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        int sumOfNElements = (n * (n - 1)) / 2;
        return sum - sumOfNElements;
    }
}
