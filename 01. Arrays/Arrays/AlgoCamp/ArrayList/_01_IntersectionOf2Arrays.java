package ArrayList;
import java.util.ArrayList;

public class _01_IntersectionOf2Arrays {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5,7};
        int[] arr2 = {2,4,5,6,7};
        ArrayList<Integer> result = intersection2Arrays(arr1,arr2);
        System.out.println(result);
    }
    public static ArrayList<Integer> intersection2Arrays(int[] arr1, int[] arr2) {
        int n1 = arr1.length;
        int n2 = arr2.length;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n2; j++) {
                if(arr1[i] == arr2[j]){
                    list.add(arr1[i]);
                    arr2[j]= Integer.MAX_VALUE;
                }
            }
        }
        return list;
    }
}
