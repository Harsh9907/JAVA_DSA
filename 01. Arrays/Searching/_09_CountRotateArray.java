public class _09_CountRotateArray {
    public static void main(String[] args) {
        int[] arr = { 15, 16, 18, 20, 22, 24, 2, 3, 4, 5, 6 };
        int result = countRotations(arr);
        System.out.println(result);
    }

    public static int countRotations(int[] arr) {
        int low = 0, high = arr.length - 1;

        while (low <= high) {
            if (arr[low] <= arr[high]) { // Case 1
                return low;
            }
            int mid = (low + high) / 2;
            int next = (mid + 1) % arr.length;
            int prev = (mid + arr.length - 1) % arr.length;

            if (arr[mid] <= arr[next] && arr[mid] <= arr[prev]) { // Case 2
                return mid;
            } else if (arr[mid] <= arr[high]) { // Case 3
                high = mid - 1;
            } else if (arr[mid] >= arr[low]) { // Case 4
                low = mid + 1;
            }
        }
        return -1;
    }
}
