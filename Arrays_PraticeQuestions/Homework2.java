package Arrays_PraticeQuestions;
import java.util.Scanner;

public class Homework2{
    public static void main(String[] args){
        //find the maximum and minimum number in an array of integer
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of array");
        int size=sc.nextInt();

    //array
        int[] number=new int[size];

        //input
        for(int i=0; i<number.length;i++){
            System.out.println("Enter The Number:");
            number[i]=sc.nextInt();
        }
        int min=Integer.MAX_VALUE;// in this line Max_Value of an array(range) is assign to int min variable is the MAX_VALUE represent the last index of the array or range.
        int max=Integer.MIN_VALUE;
        //output
        for(int i=0;i<number.length;i++){
            if(number[i]<min){
                min = number[i];
            }
            if(number[i]>max){
                max=number[i];
            }

        }
        System.out.println("min number" + min);
        System.out.println("max number" + max);

    }
}







//import java.util.*;
//
//
//public class Homework2 {
//    public static void main(String args[]) {
//        Scanner sc = new Scanner(System.in);
//        int size = sc.nextInt();
//        int numbers[] = new int[size];
//
//
//        //input
//        for (int i = 0; i < size; i++) {
//            numbers[i] = sc.nextInt();
//        }
//
//
//        int max = Integer.MIN_VALUE;
//        int min = Integer.MAX_VALUE;
//
//        for (int i = 0; i < numbers.length; i++) {
//            if (numbers[i] < min) {
//                min = numbers[i];
//            }
//            if (numbers[i] > max) {
//                max = numbers[i];
//            }
//        }
//        System.out.println("Largest number is : " + max);
//        System.out.println("Smallest number is : " + min);
//    }
//}
