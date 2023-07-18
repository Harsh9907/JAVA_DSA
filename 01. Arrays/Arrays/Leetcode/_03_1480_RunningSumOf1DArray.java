import java.util.*;

public class _03_1480_RunningSumOf1DArray {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int[] ans = runningSum(nums);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] runningSum(int[] nums) {
        int[] newArr = new int[nums.length];
        int sum = 0;
        for(int i = 0; i<nums.length;i++){
            sum = sum + nums[i];
            newArr[i] = sum;
        }
        return newArr;
    }
    public static int[] runningSum1(int[] nums){
        int[] result = new int[nums.length];
        result[0] = nums[0];
        for (int i = 0; i < nums.length; i++) {
            result[i] = result[i-1]+ nums[i];
        }
        return result;
    }
}
