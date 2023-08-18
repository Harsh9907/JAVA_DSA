public class _10_FindMissingNumberInAnArray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 5, 6, 7 };
        int n = 7;
        System.out.println(missingNum(arr, n));
        System.out.println(missingNumber(arr));
        System.out.println(missingNumXOR(arr));
    }

    public static int missingNum(int[] arr, int n) {
        for (int i = 1; i <= n; i++) {
            int flag = 0;
            for (int j = 0; j < n - 1; j++) {
                if (arr[j] == i) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                return i;
            }
        }
        return -1;
    }

    public static int missingNumber(int[] arr) {
        int n = arr.length, sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return (((n + 1) * (n + 2)) / 2) - sum;
    }

    public static int missingNumXOR(int[] arr) {
        int n = arr.length;
        int xor1 = 0, xor2 = 0;
        for (int i = 0; i < n - 1; i++) {
            xor2 = xor2 ^ arr[i];
            xor1 = xor1 ^ (i + 1);
        }
        xor1 = xor1 ^ n;

        return xor1 ^ xor2;
    }
}