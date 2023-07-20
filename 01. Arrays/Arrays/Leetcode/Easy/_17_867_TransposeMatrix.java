// https://leetcode.com/problems/transpose-matrix/

package Easy;
import java.util.Arrays;
public class _17_867_TransposeMatrix {
    public static void main(String[] args) {
        // int[][] matrix = {
        //     {2,4,-1},
        //     {-10,5,11},
        //     {18,-7,6}
        // };
        int[][] matrix = {
            {2,4,-1},
            {-10,5,11}
        };
        int[][] transposedMatrix = transpose(matrix);
        for (int[] row : transposedMatrix) {
            System.out.println(Arrays.toString(row));
        }
    }
    public static int[][] transpose(int[][] matrix) {
        int i = matrix.length;
        int j = matrix[0].length;

        int[][] arr = new int[j][i];
        for (int r = 0; r < matrix.length; r++) {
            for (int c  = 0; c < matrix[0].length; c++) {
                arr[c][r] = matrix[r][c];
            }
        }
        return arr;
    }
}