import java.util.Arrays;
import java.util.HashSet;

public class _04_RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = { 1, 1, 2, 2, 2, 3, 3, 4, 4 };
        System.out.println(removeDuplicates(arr));
        System.out.println(Arrays.toString(arr));
        System.out.println(removeDuplicates1(arr));
        System.out.println(Arrays.toString(arr));
    }

    // Time Complexity= O(nlogn + n)
    // Space Complexity = O(1)
    public static int removeDuplicates(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        System.out.println(set);
        int k = set.size();
        int j=0;
        for (int x : set) {
            arr[j++] = x;
        }
        return k;
    }

    // Time Complexity= O(n)
    // Space Complexity = O(1)
    public static int removeDuplicates1(int[] arr) {
        int i = 0;
        for (int j = 1; j < arr.length; j++) {
            if (arr[i] != arr[j]) {
                i++;
                arr[i] = arr[j];
            }
        }
        return i + 1;
    }
}