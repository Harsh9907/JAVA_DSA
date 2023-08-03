import java.util.ArrayList;

public class _23RowWiseSum {
    public static void main(String[] args) {
        int[][] arr = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8 },
                { -1, -2, -3 },
                { 10 }
        };
        ArrayList<Integer> list = rowWiseSum(arr);
        System.out.println(list);
        // Output = [6, 15, 15, -6, 10]
    }

    public static ArrayList<Integer> rowWiseSum(int[][] arr) {
        int n = arr.length;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
            list.add(sum);
        }
        return list;
    }
}