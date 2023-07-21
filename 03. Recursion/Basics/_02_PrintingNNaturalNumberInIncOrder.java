public class _02_PrintingNNaturalNumberInIncOrder {
    public static void main(String[] args) {
        int num = 5;
        printNNaturalNumber(num);
    }

    public static void printNNaturalNumber(int num) {
        if (num == 0)
            return;
        printNNaturalNumber(num - 1);
        System.out.println(num);
    }
}
