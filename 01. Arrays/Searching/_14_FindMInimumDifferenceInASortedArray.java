public class _14_FindMInimumDifferenceInASortedArray {
    public static void main(String[] args) {
        int[] arr = { 4, 7, 9, 11, 13, 14 };
        int key = 9;
        int result = search(arr, key);
        System.out.println(result);
    }

    public static int search(int[] arr, int key) {
        int floor = binarySearch(arr, key, true);
        int ceil = binarySearch(arr, key, false);
        /* EDGE CASES */
        if (ceil == -1) {
            ceil = 0;
        }
        if (ceil == arr.length) {
            ceil = arr.length - 1;
        }
        if (floor == -1) {
            floor = 0;
        }
        if (floor == arr.length) {
            floor = arr.length - 1;
        }
        /* -------- */
        if ((key - arr[floor]) > (arr[ceil] - key)) {
            return ceil;
        } else {
            return floor;
        }
    }

    public static int binarySearch(int[] arr, int key, boolean floor) {
        int start = 0, end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] > key) {
                end = mid - 1;
            } else if (arr[mid] < key) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        if (floor) {
            return end;
        } else {
            return start;
        }
    }
}
