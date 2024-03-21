package Arrays_PraticeQuestions;

public class countDigits {

    int NoOfDigit(int n){
       // int i=0; jarurat nhi tha iska
        int count=0;
        // logic for counting the no
        while(n>0){
            n=n/10;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int n=33366;
        countDigits obj=new countDigits();
        //int result= obj.NoOfDigit(n);// ye bhi kar sakte hai step by step
        System.out.println(obj.NoOfDigit(n));
    }
}
