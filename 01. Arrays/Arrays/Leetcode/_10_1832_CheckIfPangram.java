public class _10_1832_CheckIfPangram {
    public static void main(String[] args) {
        // String sentence = "thequickbrownfoxjumpsoverthelazydog";
        String sentence = "abcdefghijklmnopqrstuvwxyz";
        System.out.println(checkIfPangram(sentence));
    }
    public static boolean checkIfPangram(String sentence) {
        for(int i= 0 ; i<26;i++){
            char ch =(char)('a' + i);

            if(sentence.indexOf(ch) == -1){
                return false;
            }
        }
        return true;
    }
}
