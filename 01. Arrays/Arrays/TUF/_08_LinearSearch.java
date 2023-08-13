public class _08_LinearSearch {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 14, 13, 12 };
        System.out.println(linearSearch(arr, 14));
    }

    public static int linearSearch(int[] arr, int target) {
        int n = arr.length - 1;
        for (int i = 0; i <= n; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
