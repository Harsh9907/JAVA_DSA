public class _11_MaximumConsecutiveOnes {
    public static void main(String[] args) {
        int[] arr = { 1, 1, 0, 1, 1, 1, 0, 0, 1, 1 };
        System.out.println(maxOneCons(arr));
    }

    public static int maxOneCons(int[] arr) {
        int count = 0, max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                count++;
            } else {
                count = 0;
            }
            if (count > max) {
                max = count;
            }
        }
        return max;
    }
}
