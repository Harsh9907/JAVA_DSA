import java.util.*;

public class _13_832_FlippingAnImage{
    public static void main(String[] args) {
        int[][] image = {
            {1,1,0},
            {1,0,1},
            {0,0,0}
        };
        int[][] res = flipAndInvertImage(image);
        for(int[] ele : image){
            System.out.println(Arrays.toString(ele));
        }
    }
    public static int[][] flipAndInvertImage(int[][] image) {
        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < image[i].length; j++) {
                
                int start =0, end= 
            }
        }   
        return image;
    }
}