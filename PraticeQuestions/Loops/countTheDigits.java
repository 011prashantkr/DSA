package PraticeQuestions.Loops;

public class countTheDigits {
    public static void main(String[] args) {
        int number=5670987;
        int count = 0;

        for (; number != 0; number /= 10) {
            count++;
        }

        System.out.println("The number of digits is: " + count);
    }
    }

