package PraticeQuestions.Loops;

public class sumOfOddN0 {
    public static void main(String[] arg){
        //Java program to print all odd number and even number between 1 to 100 using for loop.

        int n=100,odd=0,even=0;
        for(int i=1;i<=n;i++){
            if(i%2!=0){
                odd=i+odd;
            }else{
                even=i+even;
            }
        }
        System.out.println(odd+ " is the total sum of odd no");
        System.out.println(even+ " is the total sum of odd no");
    }
}
