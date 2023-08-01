public class _07FindUnique {
    public static void main(String[] args) {
        int[] arr = { 1, 1, 2, 2, 3, 3 };
        int result = findUnique(arr);
        System.out.println(result);
    }

    public static int findUnique(int[] arr) {

        int res = arr[0];
        for (int index = 1; index < arr.length; index++) {
            res = res ^ arr[index];
        }
        return res;
    }
}