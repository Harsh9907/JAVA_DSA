public class _24LargestColumnSum {
    public static void main(String[] args) {
        int[][] arr = {
                { 1, 2, 3 },
                { 3, 5, 1 },
                { 5, 6, 2 }
        };
        int result = largestColumnSum(arr);
        System.out.println("The largest sum of the column present is " + result); // output : 13
    }

    public static int largestColumnSum(int[][] arr) {

        int max = Integer.MIN_VALUE;
        for (int j = 0; j < arr.length; j++) {
            int sum = 0;
            for (int i = 0; i < arr.length; i++) {
                sum += arr[i][j];
            }
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }
}
