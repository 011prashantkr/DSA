package Strings;

public class stringCompare {
    public static void main(String[] args) {
        String s1="Prashant";
        String s2="Prashant";
        String s3=new String("PRASHANT");
        String s4=new String("Sachin");

        // string comparison by using equals() methods
        System.out.println("String comparison by using equals() methods");
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s1.equals(s4));

        // string comparison by using equalsIgnoreCase() methods
        System.out.println("String comparison by using equalsIgnoreCase() methods");
        System.out.println(s1.equalsIgnoreCase(s3));


    }
}
