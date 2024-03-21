//package MethodInJava;
//
//public class Methods {
//    public static int reversArray( int n) {
//
//        int[] a = {1, 2, 3, 4, 5, 6};
//        for (int i = a.length; i >= 0;i--) {
//            System.out.println(a[i]);
//        }
//        return (n);
//    }
//    public static void main(String[] args) {
//        reversArray(int a);
//    }
//}

package MethodInJava;

public class Methods {
    public static void reversArray(int[] a) {
        for (int i = a.length-1; i >= 0; i--) {
            System.out.println(a[i]);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        reversArray(arr);
    }
}