package ArrayList;
import java.util.ArrayList;

public class _02_Add2Arrays {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {6,7,8,9,10};
        ArrayList<Integer> result = add2Arrays(arr1,arr2);
        System.out.println(result); 
    }
    public static ArrayList<Integer> add2Arrays(int[] arr1, int[] arr2) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr1.length; i++) {
            list.add(arr1[i]);
        }
        for (int i = 0; i < arr2.length; i++) {
            list.add(arr2[i]);
        }
        return list;
    }
}
