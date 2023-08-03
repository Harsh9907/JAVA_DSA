import java.util.Arrays;

public class _02_TransposeMatrix {
    public static void main(String[] args) {
        int[][] arr = {
                { 2, 4, -1, 10 },
                { -10, 5, 11, 10 },
                { 18, -7, 6, 10 }
        };
        int[][] transposedMatrix = transpose(arr);
        for (int[] row : transposedMatrix) {
            System.out.println(Arrays.toString(row));
        }
    }

    public static int[][] transpose(int[][] matrix) {
        int n = matrix.length;
        int[][] transpose = new int[matrix[0].length][n];

        for (int i = 0; i < transpose[0].length; i++) {
            for (int j = 0; j < transpose.length; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        return transpose;
    }
}
