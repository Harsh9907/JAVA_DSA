import java.util.*;

public class _27PrintLikeAWave {
    public static void main(String[] args) {
        int[][] arr = {
                { 1, 6, 7, 12 },
                { 2, 5, 8, 11 },
                { 3, 4, 9, 10 }
        };
        ArrayList<Integer> wave = printWave(arr);
        System.out.println(wave);
    }

    public static ArrayList<Integer> printWave(int[][] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        int n = arr.length;

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