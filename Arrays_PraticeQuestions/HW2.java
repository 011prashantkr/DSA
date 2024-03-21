
//both program is present min and max


package Arrays_PraticeQuestions;
//import java.util.*;
//
//public class HW2 {
//    public static void main(String[] args){
//        //find the maximum and minimum number in an array of integer
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the Size of array");
//        int size=sc.nextInt();
//
//        //array
//        int[] number=new int[size];
//
//        //input
//        for(int i=0; i<number.length;i++){
//            System.out.println("Enter The Number:");
//            number[i]=sc.nextInt();
//        }
//        //output
//        int max=number[0];
//        for(int i=1;i<number.length;i++){
//            if(max<number[i]){
//                max=number[i];
//            }
//
//        }
//        System.out.println("largest number:"+ max);
//    }
//
//}


// find the smallest no in array

import java.util.Scanner;
public class HW2{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of an array:");
        int size=sc.nextInt();//variable size ka input liye hai scanner class se

        //array

        int[] numbers = new int[size];


        // for input in array

        for(int i=0; i<size;i++){
            System.out.println("Enter the number:");
           numbers[i]=sc.nextInt();
        }

        //output
        int min=numbers[0];
        for(int i=1;i<numbers.length;i++){
            //logic of finding smallest no.
            if(min>numbers[i]){
                min=numbers[i];
            }

        }
        System.out.println("smallest  no:"+ min);
    }

}


