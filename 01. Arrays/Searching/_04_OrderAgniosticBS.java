public class _04_OrderAgniosticBS {
    public static void main(String[] args) {
        int[] arr = { 8, 7, 6, 4, 3, 2, 1 };
        int element = 2;
        System.out.println(binarySearch(arr, element));
    }

    public static int binarySearch(int[] arr, int element) {
        boolean isAsc;
        if (arr[0] < arr[arr.length - 1]) {
            isAsc = true;
        } else {
            isAsc = false;
        }

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (arr[mid] == element) {
                return mid;
            }
            if (isAsc) {
                if (element > arr[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else {
                if (element > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
