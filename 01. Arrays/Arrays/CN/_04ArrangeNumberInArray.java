import java.util.*;

public class _04ArrangeNumberInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of Array: ");
        int sizeOfArray = sc.nextInt();

        int[] arr = new int[sizeOfArray];
        arrangeArray(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void arrangeArray(int[] arr) {
        int count = 1;
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            if (count % 2 == 1) {
                arr[start] = count;
                start++;
                count++;
            } else {
                arr[end] = count;
                end--;
                count++;
            }
        }
    }
}
