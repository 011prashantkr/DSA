package MethodInJava;
import java.util.Scanner;

public class GreaterThan {

    public static void greaterThanTwoNo(int a, int b) {
        if(a>b){
            System.out.println("a is greater");
        }else{
            System.out.println(" b is greater");
        }

    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();

        greaterThanTwoNo(x,y);
        //System.out.println();
    }

}
