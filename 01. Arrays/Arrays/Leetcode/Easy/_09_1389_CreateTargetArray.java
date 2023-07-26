// https://leetcode.com/problems/create-target-array-in-the-given-order/
package Easy;

import java.util.*;

public class _09_1389_CreateTargetArray {
    public static void main(String[] args) {
        int[] nums = { 0, 1, 2, 3, 4 };
        int[] index = { 0, 1, 2, 2, 1 };
        System.out.println(createTargetArray(nums, index));
    }

    public static ArrayList<Integer> createTargetArray(int[] nums, int[] index) {
        int n = nums.length;
        ArrayList<Integer> a = new ArrayList<Integer>();
        for (int i = 0; i < nums.length; i++) {
            a.add(index[i], nums[i]);
        }
        return a;
    }
}
