// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
package Easy;
public class _16_1295_FindNumbersWithEvenNumberOfDigits{
    public static void main(String[] args) {
        int[] nums = {101,2,334,4,520};
        System.out.println(evenDigits(nums));
    }
    public static int evenDigits(int[] nums) {
        int n = nums.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            int num = nums[i];
            int digitCounter = 0;
            while(num > 0){
                num /= 10;
                digitCounter++;
            }
            if(digitCounter%2==0){
                count++;
            }
        }
        return count;
    }
}