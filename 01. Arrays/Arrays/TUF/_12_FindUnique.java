public class _12_FindUnique {
    public static void main(String args[]) {
        int[] arr = { 4, 4, 1, 2, 1, 2 };
        int ans = uniqueElement(arr);
        System.out.println("The single element is: " + ans);
        int result = uniqueElement1(arr);
        System.out.println("The single element is: " + result);
    }

    // Time Complexity = O(n^2)
    // Space Complexity = O(1)
    public static int uniqueElement(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            int num = arr[i];
            int cnt = 0;

            for (int j = 0; j < n; j++) {
                if (arr[j] == num)
                    cnt++;
            }
            if (cnt == 1)
                return num;
        }
        return -1;
    }

    // Time Complexity = O(n)
    // Space Complexity = O(1)
    public static int uniqueElement1(int[] arr) {
        int res = arr[0];
        for (int i = 1; i < arr.length; i++) {
            res = res ^ arr[i];
        }
        return res;
    }
}
