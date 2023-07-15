import java.util.*;

public class _04_1672_RichestCustomerWealth {
    public static void main(String[] args) {
        int[][] accounts = {
            {1,2,3},
            {3,2,1},
            {4,5,6}
        };

        System.out.println(maximumWealth(accounts));
    }
    public static int maximumWealth(int[][] accounts) {
        int max= Integer.MIN_VALUE;
        for (int person = 0; person < accounts.length; person++) {
            int sum = 0;
            for (int account = 0; account < accounts[0].length; account++) {
                sum +=accounts[person][account];
            }
            if(sum > max){
                max = sum;
            }
        }
        return max;        
    }
}
