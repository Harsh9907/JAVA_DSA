package Easy;
import java.util.*;

public class _06_1431_KidsWithGreatestNoOfCandies {
    public static void main(String[] args) {
        int[] candies = {4,2,1,1,2};
        // {2,3,5,1,3} - 3(extraCandies) , {12,1,12} - 10(extraCandies)
        int extraCandies = 1;
        List<Boolean> result = kidsWithCandies(candies, extraCandies);
        System.out.println(result);
    }
    // public static boolean[] kidsWithCandies(int[] candies, int extraCandies) {
    //     boolean[] result = new boolean[candies.length];
    //     int max =0;
    //     for (int i = 0; i < candies.length; i++) {
    //         if(candies[i] > max){
    //             max = candies[i];
    //         }
    //     }
    //     for (int i = 0; i < result.length; i++) {
    //         if(candies[i] + extraCandies >= max){
    //             result[i] = true;
    //         }else{
    //             result[i] = false;
    //         }
    //     }
    //     return result;   
    // }

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxCandies =0;

        for (int candy : candies) {
            maxCandies = Math.max(candy, maxCandies);
        }

        List<Boolean> result = new ArrayList<>();
        for (int candy : candies) {
            result.add(candy + extraCandies >= maxCandies);
        }  
        return result;
    }
}
