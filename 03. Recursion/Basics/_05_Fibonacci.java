public class _05_Fibonacci {
    public static void main(String[] args) {
        long num = 40;
        fibonacci1(num);
        long ans = fibonacci(num);
        System.out.println(ans);
    }

    public static long fibonacci(long num) {
        if (num < 2) {
            return num;
        }
        return fibonacci(num - 1) + fibonacci(num - 2);
    }

    public static void fibonacci1(long num) {
        int a = 0, b = 1, temp = 0;
        for (int i = 2; i <= num; i++) {
            temp = a + b;
            a = b;
            b = temp;
        }
        System.out.println(temp);
    }
}