public class _01_Stringbuilder {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("Harsh");
        str.append("deep");
        str.insert(0, "Singh ");
        str.setCharAt(6, 'h');
        // to convert it back into String
        String newStr = str.toString();
        System.out.println(str);
        System.out.println(newStr);
    }
    // append, insert, insert, setcharAt
}
