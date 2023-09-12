import java.util.Arrays;

// Time Complexity = O(N);
// Space Complexity = O(1);
// public class _05_FirstAndLastOccurence {
//     public static void main(String[] args) {
//         int[] arr ={1,2,3,4,5,5,5,5,6};
//         System.out.println(Arrays.toString(firstAndLastOcc(arr,5)));
//     }
//     public static int[] firstAndLastOcc(int[] arr, int target){
//         int first=-1, last = -1;
//         for(int i = 0; i< arr.length-1;i++){
//             if(target == arr[i]){
//                 if(first == -1){
//                     first = i;
//                 }
//                 last = i;
//             }
//         }        
//         return new int[]{first,last};
//     }
// }

// Time Complexity = O(log(N));
// Space Complexity = O(1);
public class _05_FirstAndLastOccurence {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5, 5, 5, 6 };
        int[] result = searchRange(nums, 8);
        System.out.println(Arrays.toString(result));
    }

    public static int[] searchRange(int[] nums, int target) {

        int[] ans = { -1, -1 };
        // check for first occurrence if target first
        ans[0] = search(nums, target, true);
        if (ans[0] != -1) {
            ans[1] = search(nums, target, false);
        }
        return ans;
    }

    public static int search(int[] nums, int target, boolean findStartIndex) {
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                // potential ans found
                ans = mid;
                if (findStartIndex) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}