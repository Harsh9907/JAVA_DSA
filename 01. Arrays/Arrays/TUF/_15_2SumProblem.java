import java.util.Arrays;

public class _15_2SumProblem {
    public static void main(String[] args) {
        int[] arr = { 2, 6, 5, 8, 11 };
        int target = 8;
        int[] ans = twoSum(arr, target);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] twoSum(int[] arr, int target) {
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
    }
}
