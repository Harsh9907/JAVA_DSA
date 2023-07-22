public class _05_Fibonacci {
    public static void main(String[] args) {
        int num = 63;
        int ans = fibonacci(num);
        System.out.println(ans);
    }

    public static int fibonacci(int num) {
        if (num < 2) {
            return num;
        }
        return fibonacci(num - 1) + fibonacci(num - 2);
    }
}