public class ReverseStringWordWise {
    public static void main(String[] args) {
        String str = "Hello World";
        System.out.println("Original string: " + str);
        String reversedStr = reverseStringWordwise(str);
        System.out.println("Reversed string: " + reversedStr);
    }

    public static String reverseStringWordwise(String str) {
        if (str.length() == 0) {
            return "";
        }
        int n = str.length();
        int currentWordStart;
        int currentWordEnd = n;
        String reversedString = "";
        int i;

        for (i = n - 1; i >= 0; i--) {
            if (str.charAt(i) == ' ') {
                currentWordStart = i + 1;
                reversedString += str.substring(currentWordStart, currentWordEnd) + " ";
                currentWordEnd = i;
            }
        }
        currentWordStart = i + 1;
        reversedString += str.substring(currentWordStart, currentWordEnd) + " ";
        return reversedString;
    }
}
