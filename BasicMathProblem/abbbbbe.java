package BasicMathProblem;
import java.util.Scanner;
public class abbbbbe {
    static int Percentage;
    static float Percent(int sci,int math,int sst,int totalMarks){
        int add=sci+math+sst;
        Percentage= add*100/totalMarks;
        return Percentage;
    }
//   static int average(int sci,int math,int sst){
//        int average=
//    }
    static float cgpa(int Percentage){
        return  (Percentage/9.5f);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int totalMarks=300;
        System.out.println("Enter the science marks");
        int sci=sc.nextInt();
        System.out.println("Enter the math marks");
        int math=sc.nextInt();
        System.out.println("Enter the sst marks");
        int sst =sc.nextInt();

        System.out.println("PERCENTAGE: "+ Percent(sci, math, sst, totalMarks));
        //abbbbbe obj=new abbbbbe();
        System.out.println("CGPA: "+ String.format("%.2f", cgpa(Percentage)));
    }
}