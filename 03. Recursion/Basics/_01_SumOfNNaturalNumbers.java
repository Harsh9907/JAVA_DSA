public class _01_SumOfNNaturalNumbers {
    public static void main(String[] args) {
        int num = 10;
        System.out.println(sumOfFirstNNaturalNumbers(num));
    }

    public static int sumOfFirstNNaturalNumbers(int num) {
        if (num == 1) {
            return 1;
        }
        return num + sumOfFirstNNaturalNumbers(num - 1);
    }
}