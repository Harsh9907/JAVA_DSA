public class _04_ContainDuplicate {
    public static void main(String[] args) {
        int[] arr = { 3, 1 };
        boolean result = containDuplicate(arr);
        System.out.println(result);
    }

    public static boolean containDuplicate(int[] arr) {
        int n = arr.length;
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        int duplicate = sum - (n * (n + 1)) / 2;

        return duplicate < 0 || duplicate > 0 ? true : false;
    }
}
