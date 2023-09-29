public class _13_FindIndexOf1InInfiniteBinaryArray {
    public static void main(String[] args) {
        int[] arr = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
                1, };
        int index = search1(arr);
        System.out.println(index);
    }

    // Time Complexity = O(N)
    // Space Complexity = O(1)
    public static int search1(int[] arr) {
        int target = 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    // Time Complexity = O(logN)
    // Space Complexity = O(1)
    public static int search2(int[] arr) {
        int start = 0, end = 1, target = 1;

        while (target > arr[end]) {
            int temp = end + 1;
            end = end + (end - start + 1) * 2;
            start = temp;
        }
        return binarySearch(arr, start, end);
    }

    public static int binarySearch(int[] arr, int start, int end) {
        int ans = -1, target = 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] > target) {
                end = mid - 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                ans = mid;
                end = mid - 1;
            }
        }
        return ans;
    }
}