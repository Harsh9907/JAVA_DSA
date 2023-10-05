public class _06_FindPeakElement {
    public static void main(String[] args) {
        int[] arr = { 4, 5, 6, 7, 2, 3 };
        System.out.println(peakElement(arr));
    }
    // Time Complexity = O(N)
    // Space Complexity = O(1)

    public static int peakElement(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[i + 1]) {
                return arr[i];
            }
        }
        return -1;
    }

    // Time COmplexity = O(logN)
    // Space Complexity = O(1)

    public static int peakElement(int[] arr) {
        int start = 0;
        int end = arr.length-1;

        while(start < end){
            int mid = start + (end-start)/2;

            if(arr[mid] > arr[mid+1])
        }
    }
}
