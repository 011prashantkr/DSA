package PraticeQuestions;

public class Fibonacci {
    public static int findNthFibonacci(int n) {
        if (n == 1 || n == 2) {
            return 1;
        } else {
            int[] fibArray = new int[n];
            fibArray[0] = 1;
            fibArray[1] = 1;

            for (int i = 2; i < n; i++) {
                fibArray[i] = fibArray[i - 1] + fibArray[i - 2];
            }

            return fibArray[n - 1];
        }
    }

    public static void main(String[] args) {
        int n = 7;
        int result = findNthFibonacci(n);
        System.out.println("Output: " + result);
    }
}