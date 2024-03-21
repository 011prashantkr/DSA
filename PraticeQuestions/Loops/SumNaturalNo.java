package PraticeQuestions.Loops;

public class SumNaturalNo {
    public static void main(String[]arg){
     int n=5;
     int sum=0;
     for(int i=n;i>=0;i--){// sum of n natural no in reverse
         //for normal sum of n natural no ===>
         // for(int i=0;i<=n;i++)
         sum=sum+i;
         System.out.println("natural no" +i);
     }
        System.out.println( "sum of natural no "+sum);
    }
}
