package PraticeQuestions;

import java.util.Scanner;

public class odd_Even {
    public static void main(String[]arg){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Number");
         int a=sc.nextInt();
        if(a%2==0){
            System.out.println("A is even no");
            }else{
            System.out.println("no is odd");
        }
    }
}
