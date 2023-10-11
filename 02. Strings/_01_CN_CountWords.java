import java.util.Scanner;

public class _01_CountWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string : ");
        String str = sc.nextLine();
        sc.close();
        int result = countWords(str);
        System.out.println(result);
    }

    public static int countWords(String str) {
        int n = str.length();

        if (n == 0) {
            return 0;
        }
        int count = 1;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                count++;
            }
        }
        return count;
    }
}
