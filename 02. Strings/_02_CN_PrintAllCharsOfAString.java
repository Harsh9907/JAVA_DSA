import java.util.Scanner;

public class _02_CN_PrintAllCharsOfAString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string : ");
        String str = sc.nextLine();
        sc.close();
        printCharacters(str);
    }

    public static void printCharacters(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }
    }
}
