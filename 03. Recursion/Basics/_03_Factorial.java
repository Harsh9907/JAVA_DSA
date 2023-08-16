public class _03_Factorial {
    public static void main(String[] args) {
        int num = 0;
        System.out.println(factorial(num));
    }

    public static int factorial(int num) {
        if (num == 0 || num == 1) {
            return 1;
        }
        return num * factorial(num - 1);
    }
}