package MethodInJava;
import java.util.*;

public class Question2 {

    public static int sumOfOddNo(int a) {
        int sum = 0;
        for (int i = 0; i <= a; i++) {
            if (i % 2 != 0){
               // System.out.println(a);
                sum = sum + i;
            }

        }
        return sum;
    }
        public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
            System.out.println("enter the no ");
        int n=sc.nextInt();
            //int n=5;
           int sum= sumOfOddNo(n);
            System.out.println("the sum of "+ n + "natural no is "+sum);


        }
    }

//
//package MethodInJava;
//
//public class Question2 {
//
//    public static int sumOfOddNo(int a) {
//        int sum = 0;
//        for (int i = 1; i <= a; i++) {
//            if (i % 2 != 0)
//                sum = sum + i;
//        }
//        return sum;
//    }
//
//    public static void main(String[] args) {
//        int n = 5;
//        int sum = sumOfOddNo(n);
//        System.out.println("The sum of first " + n + " odd numbers is " + sum);
//    }
//}
