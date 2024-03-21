package MethodInJava;
import java .util.Scanner;

public class Circle {
    public static float Circumference(float a){
        float circum= (float) (2*3.14*a);
        return circum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the radius of circle ");
        float radi= sc.nextFloat();
        System.out.println(Circumference(radi));

    }
}
