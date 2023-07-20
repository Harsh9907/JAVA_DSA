package Easy;
import java.util.*;

public class _13_832_FlippingAnImage{
    public static void main(String[] args) {
        // int[][] image = {
        //     {1,1,0},
        //     {1,0,1},
        //     {0,0,0}
        // };
        int[][] image = {
            {1,1,0,0},
            {1,0,0,1},
            {0,1,1,1},
            {1,0,1,0}
        };
        int[][] res = flipAndInvertImage(image);
        for(int[] ele : res){
            System.out.println(Arrays.toString(ele));
        }
        System.out.println("-----------");
        int[][] result = flipAndInvertImage1(image);
        for(int[] ele : result){
            System.out.println(Arrays.toString(ele));
        }
    }
    public static int[][] flipAndInvertImage(int[][] image) {
        for (int i = 0; i < image.length; i++) {
            // for (int j = 0; j < image[i].length; j++) {
                int start = 0; 
                int end = image[i].length-1;
                while(start < end){
                    int temp = image[i][start];
                    image[i][start] = image[i][end];
                    image[i][end] = temp;
                    start++;
                    end--;
            }
        }
        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < image[0].length; j++) {
                if(image[i][j] == 0){
                    image[i][j] =1;
                }else{
                    image[i][j] =0;
                }
            }
        }   
        return image;
    }
    public  static int[][] flipAndInvertImage1(int[][] A){
        int C = A[0].length;
        for (int[]row : A) {
            for (int i = 0; i < (C+1)/2; i++) {
                int temp = row[i] ^ 1;
                row[i] = row[C-i-1] ^ 1;
                row[C-i-1] = temp;
            }
        }
        return A;
    }
}