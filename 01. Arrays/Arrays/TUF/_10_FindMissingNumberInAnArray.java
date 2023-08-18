public class _10_FindMissingNumberInAnArray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 5, 6, 7 };
        System.out.println(missingNumber(arr));
    }

    public static int missingNumber(int[] arr) {
        int n = arr.length, sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return (((n + 1) * (n + 2)) / 2) - sum;
    }
}
