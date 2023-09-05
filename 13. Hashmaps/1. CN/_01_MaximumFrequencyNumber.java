import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class _01_MaximumFrequencyNumber {
    public static void main(String[] args) {
        String str = "harshdeep";

        char[] arr = str.toCharArray();
        System.out.println(Arrays.toString(arr));
        char[] ch = uniqueCharacter(arr);
        System.out.println(Arrays.toString(ch));

    }
    public static char[] uniqueCharacter(char[] arr) {
        HashSet<Character> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        char[] ch = new char[set.size()];
        int j =0;
        for (char c : set) {
            ch[j++] = c;
        }
        return ch;
    }
    public static String uniqueChar(String str) {
    if(str.length() == 0){
        return "";
    }
    HashMap<Character, Boolean> map = new HashMap<>();
}
