// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
package Easy;
import java.util.*;
public class _16_1295_FindNumbersWithEvenNumberOfDigits{
    public static void main(String[] args) {
        int[] nums = {10,25,334,44,520};
        System.out.println(evenDigits(nums));
        // Way to find digit in a newway
        System.out.println((int)(Math.log10(14) + 1));
    }
    public static int evenDigits(int[] nums) {
        int n = nums.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            int num = nums[i];
            int digitCounter = (int)(Math.log10(num) + 1); 
            // int digitCounter = 0;
            // while(num > 0){
            //     num /= 10;
            //     digitCounter++;
            // }
            if(digitCounter%2==0){
                count++;
            }
        }
        return count;
    }
}