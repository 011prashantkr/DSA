package MethodInJava;
import java.util.Scanner;

public class Question5 {
    public static void age(int a){
        if(a>=18){
            System.out.println("eligible for vote");
        }else{
            System.out.println("not eligible for vote");
        }
    }
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the age");
        int age=sc.nextInt();
        age(age);
    }
}
