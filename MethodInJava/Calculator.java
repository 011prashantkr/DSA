package MethodInJava;

import java.util.Scanner;

public class Calculator {
    public static void Sum(double a,double b){
        System.out.println(a+b);
    }
    public static void sub(double a,double b){
        System.out.println(b-a);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the 1no");
        double x=sc.nextDouble();
        System.out.println("enter the 2no");
        double y=sc.nextDouble();
        //double x=22;
//        double y=22;
//        double x1=22;
//        double y2=22;
        Sum(x,y);
        sub(x,y);

    }
}
