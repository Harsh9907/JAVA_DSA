import java.util.*;

public class _21InputAndPrinting2DArray {
    public static void main(String[] args) {
        int[][] arr = inputArray();
        printArray(arr);
    }

    public static int[][] inputArray() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of rows of 2d Array : ");
        int n = sc.nextInt();
        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("Enter element at " + i + " " + j + " position : ");
                arr[i][j] = sc.nextInt();
            }
        }
        sc.close();
        return arr;
    }

    public static void printArray(int[][] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
