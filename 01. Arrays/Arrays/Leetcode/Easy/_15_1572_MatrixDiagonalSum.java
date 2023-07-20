public class _15_1572_MatrixDiagonalSum {
    public static void main(String[] args) {
        // int[][] mat = {
        //     {1,2,3},
        //     {4,5,6},
        //     {7,8,9},
        // };
        int[][] mat = {
            {1,2,3,4},
            {5,6,7,8},
            {1,2,3,4},
            {5,6,7,8}
        };
        System.out.println(diagonalSum(mat));
    }
    public static int diagonalSum(int[][] mat) {
        int n = mat.length;
        int sum =0;

        for (int i = 0; i < n; i++) {
            // Add elements from primary diagonal
            sum += mat[i][i];
            // Add elements from secondary diagonal
            sum += mat[n-1-i][i];
        }
        // note:- when n is odd, means, here common element gonna add, so we have to substract it
        if(n%2 ==1){
            sum-= mat[n/2][n/2];
        }
        return sum;
    }
}
