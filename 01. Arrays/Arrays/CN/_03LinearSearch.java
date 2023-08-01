public class _03LinearSearch {
    public static void main(String[] args) {
        int[] arr = { 11, 15, 42, 1, 2, 3, 4, 5 };
        int target = 4;
        System.out.print(linearSearch(arr, target));
    }

    public static int linearSearch(int[] arr, int target) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
