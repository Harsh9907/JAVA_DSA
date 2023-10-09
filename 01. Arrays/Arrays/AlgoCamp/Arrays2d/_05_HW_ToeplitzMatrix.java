public class _05_HW_ToeplitzMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                { 1, 2, 3 },
                { 4, 1, 2 },
                { 7, 4, 1 }
        };

        boolean result = isToeplitzMatrix(matrix);
        if (result) {
            System.out.println("The given matrix is a Toeplitz matrix.");
        } else {
            System.out.println("The given matrix is not a Toeplitz matrix.");
        }
    }

    public static boolean isToeplitzMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        for (int i = 0; i < rows - 1; i++) {
            for (int j = 0; j < cols - 1; j++) {
                if (matrix[i][j] != matrix[i + 1][j + 1]) {
                    return false;
                }
            }
        }
        return true;
    }
}
