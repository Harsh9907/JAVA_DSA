import java.util.*;

public class _22ColumnWiseInputAndPrinting2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        int[][] arr = new int[rows][cols];

        for (int j = 0; j < cols; j++) {
            for (int i = 0; i < rows; i++) {
                System.out.print("Enter the element at " + i + " row " + j + " column : ");
                arr[i][j] = sc.nextInt();
            }
        }
        sc.close();

        for (int[] row : arr) {
            System.out.println(Arrays.toString(row));
        }
    }
}
