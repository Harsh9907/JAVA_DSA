import java.util.*;

public class _07_MoveZeroesToEnd {
    public static void main(String[] args) {
        int[] arr = { 1, 0, 0, 0, 2, 3 };
        moveZeroesToEnd(arr);

        System.out.println(Arrays.toString(arr));
        // int[] result = moveZeroesToEnd1(arr);
        // System.out.println(Arrays.toString(result));
    }

    // Time complexity = O(2n)
    // Space Complexity = O(listSize) // or O(n) -> if all elements are non-zeros. 

    public static int[] moveZeroesToEnd1(int[] arr){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != 0){
                list.add(arr[i]);
            }
        }
        int listSize = list.size();

        for (int i = 0; i < listSize; i++) {
            arr[i] = list.get(i);
        }
        for (int i = listSize; i < arr.length; i++) {
            arr[i] = 0;
        }
        return arr;
    }

    // Time Complexity = O(n);
    // Space Complexity = O(1);
    public static void moveZeroesToEnd(int[] arr) {
        int nonZeroPos = 0;
        for (int current = 0; current < arr.length; current++) {
            if (arr[current] != 0) {
                int temp = arr[nonZeroPos];
                arr[nonZeroPos] = arr[current];
                arr[current] = temp;
                nonZeroPos++;
            }
        }
    }
}
