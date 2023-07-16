import java.util.*;

public class _08_1365_SmallerNumberThanCurrent{
    public static void main(String[] args) {
        // int[] nums = {8,1,2,2,3}; //[4,0,1,1,3]
        // int[] nums = {6,5,4,8}; //[2,1,0,3]
        int[] nums = {7,7,7,7}; //[0,0,0,0]
        System.out.println(Arrays.toString(smallerNumberThanCurrent(nums))); 
    }
    public static int[] smallerNumberThanCurrent(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        for(int i = 0; i< n; i++){
            int count = 0;
            for(int j = 0; j<n;j++){
                if(nums[j] < nums[i] ){
                    count++;
                }
                res[i] = count;
            }
        }
        return res;
    }
}