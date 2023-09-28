public class _10_FindElementInRotatedSortedArray {
    public static void main(String[] args) {
        int[] arr = { 11, 12, 15, 18, 2, 3, 5, 8 };
        int index = search(arr, 5);
        System.out.println(index);
    }

    public static int search(int[] arr, int target) {
        int pivotIndex = searchMinElement(arr);
        int resultIndex = search(arr, pivotIndex, target);
        return resultIndex;
    }

    public static int search(int[] arr, int pivotIndex, int target) {
        int leftSortedSide, rightSortedSide;
        leftSortedSide = searchElement(arr, 0, pivotIndex - 1, target);
        if (leftSortedSide == -1) {
            rightSortedSide = searchElement(arr, pivotIndex, arr.length - 1, target);
            return rightSortedSide;
        }
        return leftSortedSide;
    }

    public static int searchMinElement(int[] arr) {
        int start = 0, end = arr.length - 1, N = arr.length;

        while (start <= end) {
            if (arr[start] <= arr[end]) {
                return start;
            }
            int mid = start + (end - start) / 2;
            int next = (mid + 1) % N;
            int prev = (mid + N - 1) % N;

            if (arr[mid] <= arr[end]) {
                end = mid - 1;
            } else if (arr[mid] >= arr[start]) {
                start = mid + 1;
            } else if (arr[prev] >= arr[mid] && arr[mid] <= arr[next]) {
                return mid;
            }
        }
        return -1;
    }

    public static int searchElement(int[] arr, int start, int end, int target) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
