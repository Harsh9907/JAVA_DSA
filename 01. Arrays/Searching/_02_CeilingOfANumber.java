public class _02_CeilingOfANumber{
    public static void main(String[] args) {
        int[] arr = { 2,3,4,5,12,16,17,19};
        int element = 6;
        System.out.println(ceiling(arr,element));
    }
    public static int ceiling(int[] arr, int element) {
        int start = 0;
        int end = arr.length-1;

        while(start<=end){
            int mid = start + (end-start)/2;

            if(element > arr[mid]){
                start = mid + 1;
            }else if( element < arr[mid]){
                end = mid - 1;
            }else{
                return arr[mid];
            }
        }
        return arr[start];
    }
}