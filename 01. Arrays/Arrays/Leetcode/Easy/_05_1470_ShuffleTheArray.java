package Easy;
import java.util.*;

public class _05_1470_ShuffleTheArray {
    public static void main(String[] args) {
        int[] nums = {2,5,1,3,4,7};
        int n = 3;
        int[] res = shuffle(nums, n);
        System.out.println(Arrays.toString(res));        
    }   
    public static int[] shuffle(int[] nums, int n) {
        int[] ans = new int[nums.length];

        for (int i = 0; i < nums.length/2; i++) {
            ans[2*i] = nums[i];
            ans[2*i+1] = nums[i+n];
        }
        return ans;
    } 
}
