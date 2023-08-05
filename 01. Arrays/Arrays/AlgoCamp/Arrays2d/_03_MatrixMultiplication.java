import java.util.Arrays;

public class _03_MatrixMultiplication {
    public static void main(String[] args) {
        int[][] arr1 = {
                { 1, 2, 3 },
                { 1, 2, 3 }
        };
        int[][] arr2 = {
                { 1, 1 },
                { 2, 2 },
                { 3, 3 }
        };
        int[][] result = multiply2_2dArrays(arr1, arr2);
        for (int[] i : result) {
            System.out.println(Arrays.toString(i));
        }
    }

    public static int[][] multiply2_2dArrays(int[][]arr1, int[][]arr2) {
        int r1 = arr1.length;
        int c1 = arr1[0].length;
        int r2 = arr2.length;
        int c2 = arr2[0].length;

        int[][] result = new int[r1][c2];

        for (int i = 0; i < r1; i++) {
            fori
            
        }
        return result;
    }
}
