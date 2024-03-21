package Arrays_PraticeQuestions;
import java.util.Scanner;

public class Sorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//also called constructor
        System.out.println("Enter The size of an array");
        int size = sc.nextInt();

        int[] num = new int[size];//array declaration

        //input
        for (int i = 0; i < num.length; i++) {
            System.out.println("enter the number");
            num[i] = sc.nextInt();
        }
            boolean isAscending=true;
        //output
        for (int i = 0; i < num.length-1; i++) {
            if (num[i] > num[i + 1]) {
                isAscending = false;
                break;
            }
            
        }
    }
}

