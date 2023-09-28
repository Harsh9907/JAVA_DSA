public class _11_SearchInNearlySortedArray {
    // Function to find an element in a nearly sorted array
    public static int modifiedBinarySearch(int arr[], int x) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            // If the element is present at one of the middle 3 positions
            if (arr[mid] == x) {
                return mid;
            }
            if (mid > low && arr[mid - 1] == x) {
                return (mid - 1);
            }
            if (mid < high && arr[mid + 1] == x) {
                return (mid + 1);
            }
            // If element is smaller than mid, then it can only be present in left (low to
            // mid-2) subarray
            if (arr[mid] > x) {
                high = mid - 2;
            } else {
                // Else the element can only be present in right (mid+2 to high) subarray
                low = mid + 2;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        int arr[] = { 2, 3, 5, 10, 30 };
        int x = 30;
        int result = modifiedBinarySearch(arr, x);
        if (result != -1) {
            System.out.println("Element is present at index " + result);
        } else {
            System.out.println("Element is not present in array");
        }
    }
}
