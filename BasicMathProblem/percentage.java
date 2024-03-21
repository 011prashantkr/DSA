package BasicMathProblem;//package BasicMathProblem;
//import java.util.Scanner;
//
//public class percentage {
//
//  public static int findPercentage(int obtainedMarks,int total){
//        int percentage=(obtainedMarks*100)/total;
//        return  percentage;
//    }
//
//    static float  cgpa(int percentage){
//       // int percentage1 = findPercentage( int obtainedMarks,int total)
//         float cgpa= percentage *9.5f;
//        return (int) cgpa;
//    }
//
//
//    static int input(){
//        Scanner sc=new Scanner(System.in);
//        System.out.println("enter the science marks");
//        int sci=sc.nextInt();
//        System.out.println("enter the math marks");
//        int math=sc.nextInt();
//        System.out.println("enter the sst marks");
//        int sst =sc.nextInt();
//        int add= sci+math+sst;
//        return add;
//
//    }
//
//    public static void main(String[] args) {
//       Scanner sc=new Scanner(System.in);
//       int  total=100+100+100;
//        int obtainedMarks = input();
//        System.out.println(STR."subject  \{obtainedMarks} totalMarks  \{total}");
//        System.out.println("percentage "+findPercentage(obtainedMarks,total));
//        System.out.println( "CGPA: "+ findPercentage(obtainedMarks,total)/9.5f);
//
//        System.out.println("Do you want to calculate it again type 1 for continue or 0 for exit");
//        int str= sc.nextInt();
//        while(str== 1){
//            obtainedMarks=input();
//            System.out.println("subject  " + obtainedMarks+ " totalMarks  " +total);
//            System.out.println("percentage "+findPercentage(obtainedMarks,total));
//            System.out.println("Do you want to calculate it again? Type 1 for continue or 0 for exit");
//            str = sc.nextInt();
//        }
//
//    }
//}


// package BasicMathProblem;
import java.util.Scanner;
class NewPercentage {
    static int Percentage;
    static float Percent(int sci,int math,int sst,int totalMarks){
        int add=sci+math+sst;
        Percentage= add*100/totalMarks;
        return Percentage;
    }
    static float cgpa(int Percentage){

        return  (Percentage/9.5f);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int totalMarks=300;
        System.out.println("enter the science marks");
        int sci=sc.nextInt();
        System.out.println("enter the math marks");
        int math=sc.nextInt();
        System.out.println("enter the sst marks");
        int sst =sc.nextInt();

        System.out.println("PERCENTAGE: "+ Percent(sci, math, sst, totalMarks));
        //abbbbbe obj=new abbbbbe();
        System.out.println("CGPA: "+ cgpa(Percentage));
    }
}