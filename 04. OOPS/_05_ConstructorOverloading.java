public class _05_ConstructorOverloading {
    String lang;

    void Main2() {
        lang = "Java";
    }

    void Main2(String language) {
        lang = language;
    }

    public void getName() {
        System.out.println("language is" + lang);
    }

    public static void main(String[] args) {
        Main2 m1 = new Main2();
        m1.getName();

    }
}
