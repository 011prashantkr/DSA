package BasicMathProblem;
import java.util.Scanner;
public class Marks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //while(true) {
//        String c="";
//        do{
        String choice = "y";
        while (choice == "y") {
            System.out.println("Enter your marks subject wise:\nEnglish, Hindi, Maths, Science, Social Science:");
            int eng = sc.nextInt();
            int hin = sc.nextInt();
            int maths = sc.nextInt();
            int sci = sc.nextInt();
            int sst = sc.nextInt();

            float total = eng + hin + maths + sci + sst;
            //int maxMarks= 500;
            float percentage = (total / 500) * 100;

            System.out.println("Your total marks are: " + total);
            System.out.println("Percentage: " + percentage + "%");

            System.out.println("Do you want to continue ? Y/N");
            choice = sc.next();
//            if(choice=1){

            }
        }
    }

