import java.util.Arrays;

public class _15_2SumProblem {
    public static void main(String[] args) {
        int[] arr = { 2, 6, 5, 8, 11 };
        int target = 14;
        int[] ans = twoSum(arr, target);
        System.out.println(Arrays.toString(ans));
    }

    // Time Complexity = O(n^2)
    // Space Complexity = O(1) for solving the problem.
    public static int[] twoSum(int[] arr, int target) {
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(i!=j){
                    if(arr[i] + arr[j] == target ){
                        return new int[]{i,j};
                    }
                }
            }
        }
        return new int[]{-1,-1};
    }

    // Time Complexity = O(n)
    // Space Complexity = O(1) for solving the problem.
    public static int[] twoSum1(int[] arr, int target) {
        // If the given array is unsorted, we have to sort it first,then time complexity = O(n + nlogn)   
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum == target) {
                return new int[] { left, right };
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        return new int[] { -1, -1 };
    // }
}
