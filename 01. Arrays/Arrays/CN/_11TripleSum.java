public class _11TripleSum {
    public static void main(String[] args) {
        // int[] arr = {1, 2, 3, 4, 5, 6, 7};
        // int sum = 12;
        int[] arr = { 2, -5, 8, -6, 0, 5, 10, 11, -3 };
        int sum = 10;
        System.out.println("Total Number triplets for target " + sum + ": " + tripleSum(arr, sum));
    }

    public static int tripleSum(int[] arr, int sum) {
        int triplePairs = 0;
        for (int i = 0; i < arr.length - 2; i++) {
            for (int j = i + 1; j < arr.length - 1; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    if (arr[i] + arr[j] + arr[k] == sum) {
                        triplePairs += 1;
                    }
                }
            }
        }
        return triplePairs;
    }
}
