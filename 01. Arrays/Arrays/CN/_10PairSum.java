public class _10PairSum {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 6, 2, 5, 4, 3, 2, 4 };
        int sum = 7;
        System.out.println("Total Number Pairs for target " + sum + ": " + pairSum(arr, sum));
    }

    public static int pairSum(int[] arr, int sum) {
        int numPairs = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == sum) {
                    numPairs += 1;
                }
            }
        }
        return numPairs;
    }
}
