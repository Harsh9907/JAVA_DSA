public class _02_ModifyString {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("Gbqtg");
        // cdEfG
        // dcFeH;
        // even index => ++;
        // odd index => --

        System.out.println(replaceAsciiFunc(str));
    }

    public static String replaceAsciiFunc(StringBuilder str) {
        StringBuilder str1 = new StringBuilder(str);
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (i % 2 == 0) {
                ch = (char) (ch + 1);

            } else {
                ch = (char) (ch - 1);
                // str1.setCharAt(i, ch);
            }
            str1.setCharAt(i, ch);
        }
        return str1.toString();
    }
}
