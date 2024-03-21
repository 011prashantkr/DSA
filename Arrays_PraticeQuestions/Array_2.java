package Arrays_PraticeQuestions;
import java.util.Scanner;

public class Array_2 {
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size of array:");
        int size=sc.nextInt();//array size is taken here

        int[] marks=new int[size];//array is initialised

        //taling input from user
        for(int i=0;i<size;i++){
            System.out.println("Enter the Marks :");
            marks[i]=sc.nextInt();
        }
        //for printing
        for(int i=0;i<marks.length;i++){
            System.out.println( "Entered Marks are:"+marks[i]);
        }




    }
}



















//import java.util.Scanner;
//public class Arrays_2 {
//    public static void main(String[]args){
//        try (//taking input only from user
//             Scanner sc = new Scanner(System.in)) {
//            int size = sc.nextInt();
//
//            int number[]=new int[size];//array
//
//
//            //for input
//            for(int i=0; i<size;i++){
//                number[i]=sc.nextInt();
//            }
//
//            //for output
//            for(int i=0;i<number.length;i++){
//                System.out.println(number[1]);
//
//            }
//        }
//
//    }
//
//}
