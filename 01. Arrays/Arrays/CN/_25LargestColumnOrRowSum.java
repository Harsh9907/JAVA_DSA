public class _25LargestColumnOrRowSum {
    public static void main(String[] args) {
        int[][] arr = {
                { 1, 2, 3 },
                { 3, 4, 5 },
                { 3, 8, 0 }
        };
        System.out.println(largestColumnOrRowSum(arr));
    }

    public static String largestColumnOrRowSum(int[][] arr) {
        // Row Sum
        int maxRowSum = 0, row = 0;
        for (int i = 0; i < arr.length; i++) {
            int rowSum = 0;
            for (int j = 0; j < arr.length; j++) {
                rowSum += arr[i][j];
            }
            // System.out.println("row " + rowSum);
            if (rowSum > maxRowSum) {
                maxRowSum = rowSum;
                row = i;
            }
        }
        // Column Sum
        int maxColumnSum = 0, column = 0;
        for (int j = 0; j < arr.length; j++) {
            int columnSum = 0;
            for (int i = 0; i < arr.length; i++) {
                columnSum += arr[i][j];
            }
            // System.out.println("column " + columnSum);
            if (columnSum > maxColumnSum) {
                maxColumnSum = columnSum;
                column = j;
            }
        }

        if (maxRowSum >= maxColumnSum) {
            return "row " + row + " " + maxRowSum;
        } else {
            return "column " + column + " " + maxColumnSum;
        }
    }
}
