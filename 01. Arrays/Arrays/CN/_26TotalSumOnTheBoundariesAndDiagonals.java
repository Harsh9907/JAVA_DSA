public class _26TotalSumOnTheBoundariesAndDiagonals {
    public static void main(String[] args) {
        int[][] arr = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        int result = sumBoundariesAndDiagonals(arr);
        System.out.println(result);
    }

    public static int sumBoundariesAndDiagonals(int[][] arr) {
        int result = diagonalsSum(arr) + boundariesSum(arr);
        return result;
    }

    public static int diagonalsSum(int[][] arr) {
        int sum = 0, n = arr.length;
        for (int i = 0; i < n; i++) {
            sum += arr[i][i];
            sum += arr[i][n - 1 - i];
        }
        if (n % 2 == 1) {
            sum -= arr[n / 2][n / 2];
        }
        return sum;
    }

    public static int boundariesSum(int[][] arr) {
        int n = arr.length;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == n - 1 || j == 0 || j == n - 1) {
                    sum += arr[i][j];
                }
            }
        }
        return sum;
    }
}
