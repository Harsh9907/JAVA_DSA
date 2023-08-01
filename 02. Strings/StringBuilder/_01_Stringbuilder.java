public class _01_Stringbuilder {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("Harsh");
        str.append("deep");
        str.insert(str.length(), "Singh ");
        str.setCharAt(0, 'h');
        // to convert it back into String
        String newStr = str.toString();
        System.out.println(str);
        System.out.println(newStr);
    }
    // append, insert, setcharAt
}
