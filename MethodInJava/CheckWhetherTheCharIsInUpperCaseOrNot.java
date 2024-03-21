package MethodInJava;

import java.util.Scanner;

public class CheckWhetherTheCharIsInUpperCaseOrNot {

    public static void check(char a) {

        if (Character.isUpperCase(a)) {
            System.out.println("1");
        } else if (Character.isLowerCase(a)) {
            System.out.println("0");
        } else {
            System.out.println("-1");
        }

    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
       // int n=sAc.nextInt();
        char letter=sc.next().charAt(0);
        //char letter = 'A';
        check(letter);

    }
}
