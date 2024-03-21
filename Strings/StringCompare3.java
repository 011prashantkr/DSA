package Strings;

import java.sql.SQLOutput;

public class StringCompare3 {
    public static void main(String[] args) {
        String s1="Prashant";
        String s2="Prashant";
        String s3 =new String("sachin");

        //compression by using compareTo() method
        System.out.println(s1.compareTo(s2));//0
        System.out.println(s2.compareTo(s3));//-35
        System.out.println(s3.compareTo(s1));//35(
    }
}
