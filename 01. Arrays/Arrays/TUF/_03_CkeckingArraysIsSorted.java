public class _03_CkeckingArraysIsSorted {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        System.out.println(isSorted(arr));
        System.out.println(isSorted1(arr));
    }

    // Time Complexity = O(n^2)
    // Space Complexity = O(1)
    public static boolean isSorted(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] > arr[j]){
                    return false;
                }   
            }
        }
        return true;
    }

    // Time Complexity = O(n)
    // Space Complexity = O(1)
    public static boolean isSorted1(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i] > arr[i+1]){
                return false;
            }
        }
        return true;
    }
}
