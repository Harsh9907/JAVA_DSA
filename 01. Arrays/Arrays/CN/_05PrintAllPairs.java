public class _05PrintAllPairs {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        printAllPairs(arr);

    }

    public static void printAllPairs(int[] arr) {
        int n = arr.length - 1;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                System.out.print("(" + arr[i] + "," + arr[j] + ")" + " ");
            }
        }
    }
}
