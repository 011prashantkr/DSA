package MethodInJava;

import java.util.Scanner;

public class question1Average {

    public static void Average(double a,double b,double c){
        System.out.println((a+b+c)/3);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        double c=sc.nextDouble();

        Average(a,b,c);
    }
}
