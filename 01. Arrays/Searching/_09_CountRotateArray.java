public class _09_CountRotateArray {
    public static void main(String[] args) {
        int[] arr = { 15, 16, 18, 20, 22, 24, 2, 3, 4, 5, 6 };
        int result = countRotations2(arr);
        System.out.println(result);
    }
    // Time Complexity - O(N)
    // Space Complexity = O(1)

    public static int countRotations1(int[] arr) {
        int min = Integer.MAX_VALUE, minIndex = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                minIndex = i;
            }
        }
        return minIndex;
    }

    // Time Complexity - O(logN)
    // Space Complexity = O(1)

    // In this problem we only have to just find out, first the middle element that
    // it is the minimum element from its surrounding elements and the second thing
    // is that we have to move always in the unsorted array

    public static int countRotations2(int[] arr) {
        int start = 0, end = arr.length - 1;

        while (start <= end) {
            if (arr[start] <= arr[end]) { // Case 1
                return start;
            }
            int mid = (start + end) / 2;
            int next = (mid + 1) % arr.length;
            int prev = (mid + arr.length - 1) % arr.length;

            if (arr[mid] <= arr[next] && arr[mid] <= arr[prev]) { // Case 2
                return mid;
            } else if (arr[mid] <= arr[end]) { // Case 3
                end = mid - 1;
            } else if (arr[mid] >= arr[start]) { // Case 4
                start = mid + 1;
            }
        }
        return -1;
    }
}

// If the array element at the mid element is less than the array element
// present at the end index so it is shown that it is a sorted array so we have
// to go in one left hand side. condition(arr[mid] <= arr[end]), then we have to
// move to the left side which is unsorted array.