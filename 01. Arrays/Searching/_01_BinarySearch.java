public class _01_BinarySearch {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };
        int element = 1;
        System.out.println(binarySearch(arr, element));
    }

    public static int binarySearch(int[] arr, int element) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (element > arr[mid]) {
                start = mid + 1;
            } else if (element < arr[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
