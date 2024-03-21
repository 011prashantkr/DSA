package PraticeQuestions.Loops;

public class primeNo {
    public static void main(String[] args){
        //given no is Prime or not

        int n=6;
        int tem=0;
        for(int i=2;i<=n-1;i++){
            if(n%i==0){
                tem=tem+1;
            }

        } if(tem>0){
            System.out.println(" %d is Not a prime no");
        }else{
            System.out.println("no is prime");
        }
    }
}
