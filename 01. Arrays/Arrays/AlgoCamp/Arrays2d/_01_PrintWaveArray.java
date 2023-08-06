import java.util.ArrayList;

public class _01_PrintWaveArray {
    public static void main(String[] args) {
        int[][] arr = {
                { 1, 6, 7, 12, 13 },
                { 2, 5, 8, 11, 14 },
                { 3, 4, 9, 10, 15 }
        };
        ArrayList<Integer> list = printWave(arr);
        System.out.println(list);
    }

    public static ArrayList<Integer> printWave(int[][] arr) {
        int n = arr.length;
        ArrayList<Integer> list = new ArrayList<>(9);

        for (int j = 0; j < arr[0].length; j++) {
            for (int i = 0; i < arr.length; i++) {
                if (j % 2 == 0) {
                    list.add(arr[i][j]);
                } else {
                    list.add(arr[n - 1 - i][j]);
                }
            }
        }
        return list;
    }
}