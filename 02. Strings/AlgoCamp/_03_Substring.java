public class _03_Substring {
    public static void main(String[] args) {
        String str = "code";
        substring(str);
    }

    public static void substring(String str) {
        for (int startIndex = 0; startIndex < str.length(); startIndex++) {
            for (int endIndex = startIndex + 1; endIndex <= str.length(); endIndex++) {
                System.out.print(str.substring(startIndex, endIndex) + " ");
            }
        }
    }
}
