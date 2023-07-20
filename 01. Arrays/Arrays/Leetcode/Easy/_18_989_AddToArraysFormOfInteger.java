package Easy;
import java.util.ArrayList;
public class _18_989_AddToArraysFormOfInteger {
    public static void main(String[] args) {
        int[] arr = {1,2,0,0};
        int k = 34;
        System.out.println(addToArray(arr,k));
    }
    public static ArrayList<Integer> addToArray(int[] arr, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        int num = 0;
        for (int i = 0; i < arr.length; i++) {
            num += arr[i] * 10;
        }
    }
}
