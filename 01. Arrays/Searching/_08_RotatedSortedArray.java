public class _08_RotatedSortedArray {
    public static void main(String[] args) {
        int[] arr = { 11, 12, 2, 3, 4, 5, 6 };
        int target = 2;
        int result = search(arr, target);
        System.out.println(result);
    }

    public static int search(int[] arr, int target) {
        int start = 0, end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }
            // if left part is sorted
            if (arr[start] <= arr[mid]) {
                if (arr[start] <= target && target <= arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (arr[mid] <= target && target <= arr[end]) {
                    // element exists
                    start = mid + 1;
                } else {
                    // element does not exist
                    end = mid - 1;
                }
            }
        }
        return -1;
    }

}
