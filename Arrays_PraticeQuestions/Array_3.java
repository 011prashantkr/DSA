package Arrays_PraticeQuestions;
import java.sql.SQLOutput;
import java.util.Scanner;

//taking an array as an input and printing its element(take input from user)
public class Array_3 {
    public static void main(String[]args){
        //size of array input by user
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the  size of Array");
        int size= sc.nextInt();

         //        initialization of array
        int[]number=new int[size];

        //taking the value of nuhmber from user using for loop
        for(int i=0;i<number.length;i++){
            System.out.println("Enter the Numbers:");
            number[i]=sc.nextInt();
        }

        //for printing

        for(int i=0;i<number.length;i++){
            System.out.println("Enter Number are:"+ number[1]);
        }

    }
}
