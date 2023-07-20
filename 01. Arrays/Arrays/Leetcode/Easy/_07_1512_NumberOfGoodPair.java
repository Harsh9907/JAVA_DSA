package Easy;
public class _07_1512_NumberOfGoodPair{
    public static void main(String[] args){
        int[] nums = {1,2,3}; //0
        // int[] nums = {1,1,1,1}; //6
        // int[] nums = {1,2,3,1,1,3}; //4
        int result = numIdenticalPairs(nums);
        System.out.println(result);
    }
    public static int numIdenticalPairs(int[] nums) {
        int n = nums.length;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if( i<j &&nums[i] == nums[j]){
                    count++;
                }
            }
        }
        return count;
    }
}