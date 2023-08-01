public class _09IntersectionOfTwoArrays {
    public static void main(String[] args) {
        int[] arr1 = { 1, 3, 4, 6, 8 };
        int[] arr2 = { 1, 3, 7 };
        intersections(arr1, arr2);
    }

    public static void intersections(int[] arr1, int[] arr2) {
        int n1 = arr1.length - 1;
        int n2 = arr2.length - 1;

        for (int i = 0; i <= n1; i++) {
            for (int j = 0; j <= n2; j++) {
                if (arr1[i] == arr2[j]) {
                    System.out.print(arr1[i] + " ");
                    arr2[j] = Integer.MIN_VALUE;
                    break;
                }
            }
        }
    }
}
