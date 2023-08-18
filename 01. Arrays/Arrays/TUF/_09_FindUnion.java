import java.util.ArrayList;
import java.util.HashSet;

public class _09_FindUnion {
    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3, 4, 5 };
        int[] arr2 = { 2, 3, 5, 6, 7 };
        ArrayList<Integer> union = findUnion(arr1, arr2);
        System.out.println(union);
    }

    // m = arr1.length, n = arr2.length
    // Time Complexity = O((m+n))log(m+n)
    // Space Complexity = O(m+n)
    public static ArrayList<Integer> findUnion1(int[] arr1, int[] arr2) {
        HashSet<Integer> s = new HashSet<>();
        ArrayList<Integer> Union = new ArrayList<>();
        for (int i = 0; i < arr1.length; i++) {
            s.add(arr1[i]);
        }
        for (int i = 0; i < arr2.length; i++) {
            s.add(arr2[i]);
        }
        for (int value : s) {
            Union.add(value);
        }
        return Union;
    }

    // m = arr1.length, n = arr2.length
    // Time Complexity = O(m + n)
    // Space Complexity = O(1) in solving the problems, O(m+n) in returing the
    // Arraylist
    public static ArrayList<Integer> findUnion(int[] arr1, int[] arr2) {
        int i = 0, j = 0;
        ArrayList<Integer> Union = new ArrayList<>();
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] <= arr2[j]) {
                if (Union.size() == 0 || Union.get(Union.size() - 1) != arr1[i]) {
                    Union.add(arr1[i]);
                }
                i++;
            } else {
                if (Union.size() == 0 || Union.get(Union.size() - 1) != arr2[j]) {
                    Union.add(arr2[j]);
                }
                j++;
            }
        }
        while (i < arr1.length) {
            if (Union.get(Union.size() - 1) != arr1[i]) {
                Union.add(arr1[i]);
            }
            i++;
        }
        while (j < arr2.length) {
            if (Union.get(Union.size() - 1) != arr2[j]) {
                Union.add(arr2[j]);
            }
            j++;
        }
        return Union;
    }
}
