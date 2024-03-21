package BasicMathProblem;

class Add {

   static String OddSumAndEvenSum(int n){
        int evenSum=0;
        int OddSum=0;
        while(n>0){
           int digit=n%10;
            if(digit%2==0){
                evenSum=evenSum+digit;
            }else{
                OddSum=OddSum+digit;
            }
            n/=10;
        }
        return evenSum+" "+OddSum;
    }


    public static void main(String[] args){
   // Scanner sc= new Scanner(System.in);
    int n =2300;
//        Main obj=new Main();
//        obj.OddSumAndEvenSum( n);
        OddSumAndEvenSum( n);
         System.out.print(OddSumAndEvenSum(n));

}}


